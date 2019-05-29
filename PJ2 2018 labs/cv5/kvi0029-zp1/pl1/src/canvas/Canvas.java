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
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl1.types.MyColor;
import shapes.EllipseInRectangle;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Canvas extends Application {

  private static Canvas cm;

  private CanvasPanel canvasPanel;
  public int getRandom(int min, int max){
    Random rand = new Random();

    return rand.nextInt(max) + min;
  }
  @Override
  public void start(Stage primaryStage) {
    synchronized (Canvas.class) {
      canvasPanel = new CanvasPanel(400, 400);
      cm = this;
      String SminX, SmaxX, SminY, SmaxY, SNum;
      int minX, maxX, minY, maxY, num;

      BorderPane root = new BorderPane();
      root.setCenter(canvasPanel);
      Scene scene = new Scene(root, root.getPrefWidth(), root.getPrefHeight());

      primaryStage.setTitle("Mnoho štěstí u 1. testu");
      primaryStage.setScene(scene);
      primaryStage.show();
      //new Resizing(root, canvasPanel);
      Canvas.class.notifyAll();

      while (true) {
        System.out.print("Zadej min pozici X: ");
        SminX = System.console().readLine();
        System.out.print("Zadej max pozici x: ");
        SmaxX = System.console().readLine();
        System.out.print("Zadej min pozici y: ");
        SminY = System.console().readLine();
        System.out.print("Zadej max pozici y: ");
        SmaxY = System.console().readLine();
        System.out.print("Zadej pocet: ");
        SNum = System.console().readLine();
        minX=Integer.parseInt(SminX);
        maxX=Integer.parseInt(SmaxX);
        minY=Integer.parseInt(SminY);
        maxY=Integer.parseInt(SmaxY);
        num=Integer.parseInt(SNum);
        if (minX < 0 || minX > 400 ||
                maxX < minX || maxX > 400 ||
                minY < 0 || minY > 400 ||
                maxY < minY || maxY > 400) {
          System.out.print("neco zadano spatne, zadej znova");
        }
        else {
          ArrayList<EllipseInRectangle> tmp= new ArrayList<EllipseInRectangle>();
          for (int i = 0; i < num; i++) {
            int min=getRandom(minX, maxX);
            int max=getRandom(min, maxX);
            int smin=getRandom(minY, maxY);
            int smax=getRandom(smin, maxY);
            tmp.add(new EllipseInRectangle(min,max,smin,smax));

          }
        }
      }


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

  public static Canvas getInstance() {
    if (cm == null) {
      launchAsync();
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
   * @see cz.kozusznik.pl1.shapes.CanvasPanel#erase()
   */
  public void erase(Shape shape) {
    canvasPanel.erase(shape);
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

}
