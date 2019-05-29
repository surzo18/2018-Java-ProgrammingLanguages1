package pl1.canvas;
/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/

import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javafx.event.EventHandler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.ArcType;
import pl1.types.MyColor;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class CanvasPanel extends Pane {

  private final static MyColor DEFAULT_BACKGROUND_COLOR = MyColor.CREAMY;

  private MyColor colorOfBackground;

  final private javafx.scene.canvas.Canvas canvas;
  private GraphicsContext graphicsContext;
  private Pane pane;

  /**
   * @param width
   * @param height
   */
  public CanvasPanel(double width, double height) {
    super();
    setWidth(width);
    setHeight(height);
    //this.height = height;
    pane = new Pane() {
      {
        setWidth(width);
        setHeight(height);
      }
    };

    canvas = new javafx.scene.canvas.Canvas(width, height);
    graphicsContext = canvas.getGraphicsContext2D();
    setColorOfBackground(DEFAULT_BACKGROUND_COLOR);
    getChildren().add(pane);
    pane.getChildren().add(canvas);
    new Resizing(this, pane);
  }

  public void setColorOfForeground(MyColor color) {
    graphicsContext.setFill(getColor(color.getColor()));

  }

  public MyColor getColorOfBackground() {
    return colorOfBackground;
  }

  public void setColorOfBackground(MyColor color) {
    colorOfBackground = color;
    erase();
  }

  public void erase() {
    erase(new Rectangle2D.Double(0, 0, canvas.getWidth(), canvas.getHeight()));
  }

  public void erase(Shape shape) {
    Paint original = graphicsContext.getFill();
    Paint stroke = graphicsContext.getStroke();
    double lineW = graphicsContext.getLineWidth();
    graphicsContext.setLineWidth(lineW * 3);
    graphicsContext.setFill(getColor(colorOfBackground.getColor()));
    graphicsContext.setStroke(getColor(colorOfBackground.getColor()));
    fill(shape);
    graphicsContext.setFill(original);
    graphicsContext.setStroke(stroke);
    graphicsContext.setLineWidth(lineW);
  }

  public void fill(Shape shape) {
    Paint p = null;
    if (!(shape instanceof Arc2D)) {
      p = graphicsContext.getStroke();
      graphicsContext.setStroke(graphicsContext.getFill());
    }

    if (shape instanceof Ellipse2D) {
      Ellipse2D ellipse = (Ellipse2D) shape;
      graphicsContext.fillOval(ellipse.getX(), ellipse.getY(),
          ellipse.getWidth(), ellipse.getHeight());
      graphicsContext.strokeOval(ellipse.getX(), ellipse.getY(),
          ellipse.getWidth(), ellipse.getHeight());

    } else if (shape instanceof Rectangle2D) {
      Rectangle2D rect = (Rectangle2D) shape;
      graphicsContext.fillRect(rect.getX(), rect.getY(), rect.getWidth(),
          rect.getHeight());
    } else if (shape instanceof Polygon) {
      Polygon rect = (Polygon) shape;
      graphicsContext.fillPolygon(toDouble(rect.xpoints),
          toDouble(rect.ypoints), rect.npoints);
      graphicsContext.strokePolygon(toDouble(rect.xpoints),
          toDouble(rect.ypoints), rect.npoints);

    } else if (shape instanceof Arc2D) {
      Arc2D arc = (Arc2D) shape;
      graphicsContext.fillArc(arc.getX(), arc.getY(), arc.getWidth(),
          arc.getHeight(), arc.getAngleStart(), arc.getAngleExtent(),
          ArcType.ROUND);
      graphicsContext.strokeArc(arc.getX(), arc.getY(), arc.getWidth(),
          arc.getHeight(), arc.getAngleStart(), arc.getAngleExtent(),
          ArcType.ROUND);
    }
    if (p != null) {
      graphicsContext.setStroke(p);
    }
  }

  private double[] toDouble(int[] points) {
    double[] result = new double[points.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = points[i];
    }
    return result;
  }

  private static Paint getColor(java.awt.Color color) {
    return Color.rgb(color.getRed(), color.getGreen(), color.getBlue(),
        color.getAlpha() / 255.);
  }

  public void
      setOnMouseClicked2Canvas(EventHandler<? super MouseEvent> eventHandler) {
    canvas.setOnMouseClicked(eventHandler);

  }

  public void setOnMouseMoved2Canvas(EventHandler<? super MouseEvent> cm) {
    canvas.setOnMouseMoved(cm);

  }

}
