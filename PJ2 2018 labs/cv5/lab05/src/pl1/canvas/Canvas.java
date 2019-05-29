package pl1.canvas;

/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/

import java.awt.Shape;
import java.util.ArrayList;
import java.util.Iterator;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl1.shapes.Pacman;
import pl1.types.Direction8;
import pl1.types.MyColor;
import pl1.types.Position;
import pl1.utils.IO;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Canvas {

  private static Canvas cm;

  private CanvasPanel canvasPanel;

  @FXML
  private TextField actualX;

  @FXML
  private TextField actualY;

  @FXML
  private TextField selectedX;

  @FXML
  private TextField selectedY;

  @FXML
  private ToggleGroup actionGroup;

  @FXML
  private RadioButton createRB;

  @FXML
  private RadioButton moveRB;

  @FXML
  private RadioButton deleteRB;

  @FXML
  private RadioButton modifyRB;

  private ArrayList<Pacman> pacmens= new ArrayList<>();

  private boolean firstClick= false;
  private boolean secondClick= false;
  private Position leftCorner;
  private Position rightCorner;
  Pacman picked;

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
    canvasPanel.setOnMouseClicked2Canvas(e -> handleClicked(e));
    canvasPanel.setOnMouseMoved2Canvas(e -> handleMoved(e));
  }

  public static Canvas getInstance() {
    if (cm == null) {
      JavaFXApplication.launchAsync();
    }
    return cm;
  }


  public void setColorOfForeground(MyColor color) {
    canvasPanel.setColorOfForeground(color);
  }


  public MyColor getColorOfBackground() {
    return canvasPanel.getColorOfBackground();
  }


  public void setColorOfBackground(MyColor color) {
    canvasPanel.setColorOfBackground(color);
  }


  public void erase() {
    canvasPanel.erase();
  }

  public void erase(Shape shape) {
    canvasPanel.erase(shape);

  }


  public void fill(Shape shape) {
    canvasPanel.fill(shape);
  }


  public double getWidth() {
    return canvasPanel.getWidth();
  }


  public double getHeight() {
    return canvasPanel.getHeight();
  }

  public void handleClicked(MouseEvent event) {
    double x1=event.getX();
    double y1=event.getY();
    if (createRB.isSelected() && !this.firstClick){
      this.leftCorner= new Position((int)x1, (int)y1);
      this.firstClick=true;
    }
    else if (createRB.isSelected() && this.firstClick) {
      this.rightCorner= new Position((int)x1, (int)y1);
      int height = 0;
      int width = 0;
      height = this.rightCorner.getX() - leftCorner.getX();
      width = this.rightCorner.getY() - leftCorner.getY();

      if (width <= 0 || height <= 0) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("O kurwa!!! Se posralo");
        alert.setHeaderText("Error size");
        alert.setContentText("U noob");
        alert.showAndWait();
      } else {
        Pacman pacman = new Pacman(leftCorner.getX(), leftCorner.getY(), Direction8.EAST, height, width);
        pacmens.add(pacman);
      }
      firstClick = false;
    }
    else if(modifyRB.isSelected() && !firstClick) {
      Iterator<Pacman>i = pacmens.iterator();

      while (i.hasNext()&&!firstClick){
        Pacman pacman=i.next();
        if ((x1>=pacman.getxPos()&& x1<=pacman.getxPos()+pacman.getHeight())&& (y1>=pacman.getyPos()&& y1<=pacman.getyPos()+getHeight()) ){
          picked=pacman;
          firstClick=true;
          break;
        }
      }
        //todo
    }
    else if (modifyRB.isSelected() && firstClick){
      Iterator<Pacman>i = pacmens.iterator();

      x1=event.getX();
      y1=event.getY();
      //picked.setPosition((int)x1, (int)y1);
      picked.setHeight((int)x1-picked.getxPos());
      picked.setWidth((int)y1-picked.getyPos());
      picked.erase();
      Pacman pacman = new Pacman(leftCorner.getX(), leftCorner.getY(), Direction8.EAST,picked.getHeight(), picked.getWidth());


      firstClick=false;
    }
    else if (moveRB.isSelected() && !firstClick ) {
      Iterator<Pacman>i = pacmens.iterator();

      while (i.hasNext()&&!firstClick){
        Pacman pacman=i.next();
        if ((x1>=pacman.getxPos()&& x1<=pacman.getxPos()+pacman.getHeight())&& (y1>=pacman.getyPos()&& y1<=pacman.getyPos()+getHeight()) ){
          picked=pacman;
          firstClick=true;
          break;
        }
      }
    }
    else if (moveRB.isSelected() && firstClick){
      x1=event.getX();
      y1=event.getY();
      picked.setPosition((int)x1, (int)y1);
      firstClick=false;
    }
    else if (deleteRB.isSelected()){
      Iterator<Pacman>i = pacmens.iterator();

      while (i.hasNext()){
        Pacman pacman=i.next();
        if ((x1>=pacman.getxPos()&& x1<=pacman.getxPos()+pacman.getWidth())&& (y1>=pacman.getyPos()&& y1<=pacman.getyPos()+pacman.getHeight()) ){
          pacman.erase();
          i.remove();
          break;
        }
      }
    }



    /*double x = event.getX();
    double y = event.getY();
    selectedX.setText("" + x);
    selectedY.setText("" + y);
    if (createRB.isSelected()) {
      new Pacman((int) x, (int) y, Direction8.EAST);
    }*/




  }

  public void handleMoved(MouseEvent event) {
    double x = event.getX();
    double y = event.getY();
    actualX.setText("" + x);
    actualY.setText("" + y);

  }

  private Node createControlPanel(double width, double height) {
    Pane result = IO.loadFXML(this, "manipulation_panel.fxml");
    return result;
  }

}
