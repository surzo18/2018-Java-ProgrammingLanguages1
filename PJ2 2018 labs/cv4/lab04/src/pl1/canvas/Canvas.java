package pl1.canvas;
/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/

import java.awt.Shape;
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl1.types.MyColor;
import pl1.utils.IO;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Canvas {

  private static Canvas cm;

  private CanvasPanel canvasPanel;

  @FXML
  private TextField minX;

  @FXML
  private TextField maxX;

  @FXML
  private TextField minY;

  @FXML
  private TextField maxY;

  @FXML
  private TextField size;

  public static class JavaFXApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
      synchronized (Canvas.class) {
        cm = new Canvas(primaryStage);
        Canvas.class.notifyAll();
      }
    }

    public static void launchAsync(String... args) {
      new Thread(() -> launch(args)).start();
      synchronized (Canvas.class) {
        while (cm == null) {
          try {
            Canvas.class.wait();
          } catch (InterruptedException e) {
            //ignore
            return;
          }
        }
      }
    }

  }

  /**
   * @param primaryStage
   */
  private Canvas(Stage primaryStage) {
    canvasPanel = new CanvasPanel(400, 400);
    BorderPane root = new BorderPane();
    root.setCenter(canvasPanel);
    Node cp = createControlPanel(50, canvasPanel.getHeight());
    root.setLeft(cp);
    Scene scene = new Scene(root, root.getPrefWidth(), root.getPrefHeight());

    primaryStage.setTitle("Hello World!");
    primaryStage.setScene(scene);
    primaryStage.show();

  }

  public static Canvas getInstance() {
    if (cm == null) {
      JavaFXApplication.launchAsync();
    }
    return cm;
  }

  /**
   * @param color
   * @see cz.kozusznik.pl1.shapes.CanvasPanel#setColorOfForeground(cz.kozusznik.pl1.shapes.MyColor)
   */
  public void setColorOfForeground(MyColor color) {
    canvasPanel.setColorOfForeground(color);
  }

  /**
   * @return
   * @see cz.kozusznik.pl1.shapes.CanvasPanel#getColorOfBackground()
   */
  public MyColor getColorOfBackground() {
    return canvasPanel.getColorOfBackground();
  }

  /**
   * @param color
   * @see cz.kozusznik.pl1.shapes.CanvasPanel#setColorOfBackground(cz.kozusznik.pl1.shapes.MyColor)
   */
  public void setColorOfBackground(MyColor color) {
    canvasPanel.setColorOfBackground(color);
  }

  /**
   * @see cz.kozusznik.pl1.shapes.CanvasPanel#erase()
   */
  public void erase() {
    canvasPanel.erase();
  }

  /**
   * @param shape
   * @see cz.kozusznik.pl1.shapes.CanvasPanel#fill(java.awt.Shape)
   */
  public void fill(Shape shape) {
    canvasPanel.fill(shape);
  }

  /**
   * @return
   * @see cz.kozusznik.pl1.shapes.CanvasPanel#getWidth()
   */
  public double getWidth() {
    return canvasPanel.getWidth();
  }

  /**
   * @return
   * @see cz.kozusznik.pl1.shapes.CanvasPanel#getHeight()
   */
  public double getHeight() {
    return canvasPanel.getHeight();
  }

  private Node createControlPanel(double width, double height) {
    Pane result = IO.loadFXML(this, "manipulation_panel.fxml");
    //result.setPrefHeight(height);
    return result;
  }

  @FXML
  private void create(ActionEvent event) {
    Random rnd = new Random();
    String strMinx = minX.getText();
    String strMaxx = maxX.getText();
    String strMiny = minY.getText();
    String strMaxy = maxY.getText();
    String sizeStr = size.getText();

    int minx = Integer.parseInt(strMinx);
    int maxx = Integer.parseInt(strMaxx);
    //prostudujte prednasku 03 a vysvetlete, proc to tak pocitame
    int x = rnd.nextInt((maxx + 1) - minx) + minx;

    //TODO podobne získat y
    int y = 0;

    //TODO vytvorit novy tvar;
    System.out.println("x: " + x + ", y: " + y);
  }

}
