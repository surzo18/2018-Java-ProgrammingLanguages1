/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package pl1.shapes.manager;

import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl1.lab07.IClickable;
import pl1.shapes.MyColor;
import pl1.utils.IO;
import pl1.utils.JavaFXApplication;
import pl1.utils.Resizing;

import javax.swing.*;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class CanvasManager {

  private static CanvasManager CM;

  public static synchronized CanvasManager getInstance() {
    if (CM == null) {
      CM = new CanvasManager();
      CM.createUI();
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

  private static MyColor colorOfForeground;

  private boolean needRepaint = false;

  private int noPaint = 0;

  private Runnable repaintCommand = new P_RepaintCommand();

  private List<IPaintable> subjects = new LinkedList<>();

  private Thread paintingTread;

  private ManipulationPanelController manipulationPanel;

  //private GraphicsContext graphicsContext;


  private CanvasManager() {
    colorOfBackground = DEFAULT_BACKGROUND_COLOR;
    new P_CanvasPanel(WIDTH, HEIGHT);

  }

  public void setColorOfBackground(MyColor defaultBackgroundColor) {
    colorOfBackground = defaultBackgroundColor;
    repaint();
  }

  public static void setColorOfForeground(MyColor color) {
    colorOfForeground=color;
  }

  public void fill(Shape shape) {
    CM.fill(shape);
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

  protected void createUI() {
    final Stage ps = JavaFXApplication.getPrimaryStage();
    Platform.runLater(() -> createRoot(ps));

  }


  private void createRoot(Stage ps) {
    BorderPane root = new BorderPane();
    root.setCenter(CM.rootDrawingPane);
    root.setLeft(createControlPanel(
        CM.manipulationPanel = new ManipulationPanelController(), WIDTH,
        HEIGHT));
    Scene scene = new Scene(root, root.getPrefWidth(), root.getPrefHeight());
    ps.setTitle("Hello World!");
    ps.setScene(scene);
    ps.show();
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

  public void delete(double x, double y) {
    Iterator<IPaintable> iterator=this.subjects.iterator();
    while (iterator.hasNext()){
      IPaintable item = iterator.next();
      if (item instanceof IClickable){
        if (((IClickable) item).isInBounds(x,y)){
          ((IClickable) item).clear();
          iterator.remove();
          break;

        }
      }
    }


  }

  private class P_CanvasPanel extends Pane {

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
      MyGraphics g = getGraphics();
      try {
        g.fillRectangle(0, 0, getWidthInPoints(), getHeightInPoints(),
            colorOfBackground);

        for (IPaintable subject : subjects) {
          subject.paint(g);
        }
      } finally {
        paintingTread = null;
      }

    }

  }
}
