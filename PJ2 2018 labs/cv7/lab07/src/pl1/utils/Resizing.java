/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package pl1.utils;

import javafx.beans.binding.DoubleBinding;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Resizing {

  /**
   * @param resizableParent
   * @param child
   */
  public Resizing(Region resizableParent, Node child) {
    double w_1 = resizableParent.getWidth();
    double h_1 = resizableParent.getHeight();
    double w_2 = getWidth(child);
    double h_2 = getHeight(child);

    DoubleBinding scaleX =
        resizableParent.widthProperty().subtract(w_1 - w_2).divide(w_2);
    DoubleBinding translateX =
        scaleX.subtract(1.).multiply(w_2 / 2).add(child.getLayoutX());

    child.scaleXProperty().bind(scaleX);
    child.translateXProperty().bind(translateX);

    DoubleBinding scaleY =
        resizableParent.heightProperty().subtract(h_1 - h_2).divide(h_2);
    DoubleBinding translateY = scaleY.subtract(1.).multiply(h_2 / 2);

    child.scaleYProperty().bind(scaleY);
    child.translateYProperty().bind(translateY);
  }

  private double getWidth(Node child) {
    if (child instanceof javafx.scene.canvas.Canvas) {
      javafx.scene.canvas.Canvas canvas = (javafx.scene.canvas.Canvas) child;
      return canvas.getWidth();
    } else if (child instanceof Pane) {
      Pane p = (Pane) child;
      return p.getWidth();
    }
    throw new IllegalArgumentException();
  }

  private double getHeight(Node child) {
    if (child instanceof javafx.scene.canvas.Canvas) {
      javafx.scene.canvas.Canvas canvas = (javafx.scene.canvas.Canvas) child;
      return canvas.getHeight();
    } else if (child instanceof Pane) {
      Pane p = (Pane) child;
      return p.getHeight();
    }
    throw new IllegalArgumentException();
  }
}
