/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package pl1.canvas;

import javafx.beans.binding.DoubleBinding;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Region;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Resizing {

  /**
   * @param resizableParent
   * @param canvas
   */
  public Resizing(Region resizableParent, Canvas canvas) {
    double w_1 = resizableParent.getWidth();
    double h_1 = resizableParent.getHeight();
    double w_2 = canvas.getWidth();
    double h_2 = canvas.getHeight();

    DoubleBinding scaleX =
        resizableParent.widthProperty().add(w_1 - w_2).divide(w_2);
    DoubleBinding translateX = scaleX.subtract(1.).multiply(w_2 / 2);

    canvas.scaleXProperty().bind(scaleX);
    canvas.translateXProperty().bind(translateX);

    DoubleBinding scaleY =
        resizableParent.heightProperty().add(h_1 - h_2).divide(h_2);
    DoubleBinding translateY = scaleY.subtract(1.).multiply(h_2 / 2);

    canvas.scaleYProperty().bind(scaleY);
    canvas.translateYProperty().bind(translateY);
  }

}
