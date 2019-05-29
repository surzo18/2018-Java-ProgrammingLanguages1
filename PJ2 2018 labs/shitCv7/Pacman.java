package pl1.shapes.manager;
/*******************************************************************************
 * Kozusznik Jan
 * Copyright (c) 2014 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/

import pl1.lab07.IClearable;
import pl1.lab07.IClickable;
import pl1.lab07.IValuable;
import pl1.shapes.Direction8;
import pl1.shapes.MyColor;


/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Pacman implements IPaintable, IClickable, IClearable, IValuable {

  private static  int SIZE = 30;

  private static final double SIZE_OF_EYE_PORTION = 0.15;

  private static final int ANGLE = 40;

  private int xPos;

  private int yPos;
  public int height;
  public int width;

  private Direction8 direction;
  private Arc head;
  private Ellipse eye;

  private static final CanvasManager CM = CanvasManager.getInstance();

  public Pacman(int x, int y, Direction8 direction) {
    xPos = x;
    yPos = y;
    this.direction = direction;
    head = new Arc(x, y, SIZE, SIZE, MyColor.YELLOW, direction.celemVzad(),
        computeAngle());
    eye = new Ellipse(getEyeX(), getEyeY(), getEyeSize(), getEyeSize(),
        MyColor.BLACK);
    paint();
  }
  public Pacman(int x, int y, Direction8 direction, int width, int height) {
    xPos = x;
    yPos = y;
    this.width=width;
    this.height =height;
    this.direction = direction;
    head = new Arc(x, y, width, height , MyColor.YELLOW, direction.celemVzad(),
            computeAngle());
    eye = new Ellipse(getEyeX(), getEyeY(), getEyeSize(), getEyeSize(),
            MyColor.BLACK);
    paint();
    SIZE=width;
  }

  public void setDirection(Direction8 direction8) {
    erase();
    direction = direction8;
    head.setDirection(direction8.celemVzad());
    paint();
  }

  public void setPosition(int x, int y) {
    erase();
    xPos = x;
    yPos = y;
    head.setPosition(x, y);
    eye.setPosition(getEyeX(), getEyeY());
    paint();
  }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void erase() {
    head.erase();

  }

  public void paint() {
    head.paint();
    eye.paint();
  }

  public void moveRight(int step) {
    setPosition(xPos + step, yPos);

  }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void moveDown(int step) {
    setPosition(xPos, yPos + step);
  }

  public boolean isInBound(int x, int y) {
    return (xPos <= x) && (x <= (xPos + this.width)) && (yPos <= y)
        && (y <= (yPos + this.height));
  }

  private int getEyeSize() {
    return (int) getEyeSizeD();
  }

  private double getEyeSizeD() {
    return SIZE_OF_EYE_PORTION * this.height;
  }

  private int computeAngle() {
    return 360 - ANGLE;
  }

  private int getEyeX() {
    switch (direction) {
      case EAST:
        return ((xPos + (this.width / 2)) - (getEyeSize() / 2)) + (getEyeSize() / 4);
      case WEST:
        return (((xPos + this.width) - getEyeSize() - (this.width / 2))
            + (getEyeSize() / 2)) - (getEyeSize() / 4);
      case NORTH:
      case SOUTH:
        return xPos + (this.width / 4);
      default:
        return 0;
    }

  }

  private int getEyeY() {
    switch (direction) {
      case EAST:
      case WEST:
        return yPos + (this.height / 4);
      case NORTH:
        return (((yPos + this.height) - getEyeSize() - (this.height / 2))
            + (getEyeSize() / 2)) - (getEyeSize() / 4);
      case SOUTH:
        return ((yPos + (this.height / 2)) - (getEyeSize() / 2)) + (getEyeSize() / 4);
      default:
        return 0;
    }

  }

  @Override
  public boolean isInBounds(double x, double y) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override
  public double getValue() {
    return (Math.PI*width*height- (Math.PI*width*height*ANGLE)/360);
  }

  @Override
  public void paint(MyGraphics graphics) {
    CM.repaint();
  }
}
