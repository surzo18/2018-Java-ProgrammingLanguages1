/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package cz.kozusznik.pl1.shapes.manager;

import java.util.LinkedList;
import java.util.List;

import cz.kozusznik.pl1.shapes.MyColor;
import cz.kozusznik.pl1.utils.IO;
import cz.kozusznik.pl1.utils.JavaFXApplication;
import cz.kozusznik.pl1.utils.Resizing;
import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class CanvasManager {

  private static CanvasManager CM;

  public static synchronized CanvasManager getInstance() {
    if (CM == null) {
      CM = new CanvasManager();
      P_Application.launchAsync(P_Application.class);

      CM.repaint();
    }
    return CM;
  }

  private final static MyColor DEFAULT_BACKGROUND_COLOR = MyColor.CREAMY;

  private final static int WIDTH = 400;

  private final static int HEIGHT = 400;

  private Canvas canvas;

  private MyGraphics graphics;

  private Pane rootDrawingPane;

  private MyColor colorOfBackground;

  private boolean needRepaint = false;

  private int noPaint = 0;

  private Runnable repaintCommand = new P_RepaintCommand();

  private List<IPaintable> subjects = new LinkedList<>();

  private Thread paintingTread;

  private ManipulationPanelController manipulationPanel;

  private CanvasManager() {
    colorOfBackground = DEFAULT_BACKGROUND_COLOR;
    new P_CanvasPanel(WIDTH, HEIGHT);

  }

  public void setColorOfBackground(MyColor defaultBackgroundColor) {
    colorOfBackground = defaultBackgroundColor;
    repaint();
  }

  /***************************************************************************
   * Vykreslí všechny elementy.
   */
  public synchronized void repaint() {
    if (paintingTread == Thread.currentThread()) { //Právě překresluji - volám nepřímo sám sebe
      return;
    }
    if ((noPaint == 0) && isVisible()) //Mám kreslit a je proč
    {
      needRepaint = true;
      Platform.runLater(repaintCommand);
    }
  }

  public synchronized void add(IPaintable paint) {
    subjects.add(paint);
    repaint();
  }

  public double getWidthInPoints() {
    return rootDrawingPane.getWidth();
  }

  public double getHeightInPoints() {
    return rootDrawingPane.getHeight();
  }

  public boolean isVisible() {
    return rootDrawingPane.isVisible();
  }

  public synchronized void noPaint() {
    noPaint++;
  }

  public synchronized void returnPaint() {
    if (noPaint == 0) {
      throw new IllegalStateException("Repainting is active");
    }
    noPaint--;
  }

  private static Node createControlPanel(Object thiz, double width,
      double height) {
    Pane result = IO.loadFXML(thiz, "manipulation_panel.fxml");

    return result;
  }

  private MyGraphics getGraphics() {
    if (graphics == null) {
      graphics = new MyGraphics(canvas.getGraphicsContext2D());
    }
    return graphics;
  }

  private class P_CanvasPanel extends Pane {

    /**
     *
     */
    public P_CanvasPanel(double width, double height) {
      setWidth(width);
      setHeight(height);
      rootDrawingPane = this;
      canvas = new Canvas(width, height);
      rootDrawingPane.getChildren().add(canvas);
      new Resizing(this, canvas);
      setOnMousePressed(e -> manipulationPanel.mousePressed(e));
      setOnMouseMoved(e -> manipulationPanel.mouseMoved(e));
    }
  }

  public static class P_Application extends JavaFXApplication {

    @Override
    protected Region createRoot() {
      BorderPane root = new BorderPane();
      root.setCenter(CM.rootDrawingPane);
      root.setLeft(createControlPanel(
          CM.manipulationPanel = new ManipulationPanelController(), WIDTH,
          HEIGHT));
      return root;
    }

  }

  /**
   * @author Jan Kožusznik
   * @version 0.1
   */
  private class P_RepaintCommand implements Runnable {

    @Override
    public void run() {
      synchronized (CanvasManager.this) {
        if (needRepaint) {
          needRepaint = false;
        } else {
          return;
        }
      }
      paintingTread = Thread.currentThread();
      try {
        getGraphics().fillRectangle(0, 0, getWidthInPoints(),
            getHeightInPoints(), colorOfBackground);

        for (IPaintable subject : subjects) {
          subject.paint(getGraphics());
        }
      } finally {
        paintingTread = null;
      }

    }

  }

  public void remove(IPaintable i) {
    subjects.remove(i);
    repaint();
  }
}
