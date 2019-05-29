package pl1.lab04;

import pl1.shapes.Arc;
import pl1.shapes.Ellipse;
import pl1.types.Direction8;
import pl1.types.MyColor;

import static java.lang.Math.abs;
import static javafx.application.Platform.exit;


public class Pacman {

  private static final int SIZE = 30;

  private static final double SIZE_OF_EYE_PORTION = 0.15;

  private static final int ANGLE = 40;

  private int xPos;

  private int yPos;

  private Direction8 direction;

  private Arc _head;

  private Ellipse _eye;

  //TODO 1. deklarace hlavy a oka - instanční proměnné

  public Pacman(int x, int y, Direction8 direction) {
    this.xPos = x;
    this.yPos = y;
    this.direction = direction;

    this._head= new Arc(x, y, SIZE, SIZE, MyColor.getColor("zluta"), direction, computeAngle());
    this._eye = new Ellipse( getEyeX(), getEyeY(), getEyeSize(), getEyeSize(), MyColor.BLACK);
    //TODO 2. doplnit vytvoreni hlavy a oka
    //hlavu realizuje Arc
    // -pozice - x,y
    // -rozmer - SIZE,SIZE;
    // -barva - zluta (MyColor.getColor("zluta"))
    // -úhel - volání metody computeAngle
    // -orientace - opačná ke směru (metoda celemVzad volaná na směr - proměnná direction)
    //oko realizue Ellipse
    // -pozice x,y - getEyeX(), getEyeY() - volání členských metod
    // -rozmer - getEyeSize(), getEyeSize() - volání členských metod
    // -barva - cerna
    paint();
  }

  public void setDirection(Direction8 direction8) {
    erase();
    this.direction = direction8;
    //TODO 6. nastavení orientace hlavy a pozice oka
    this._head.setDirection(direction);
//    this._eye.setDirection(direction);
    paint();
  }

  public void setPosition(int x, int y) {
    erase();
    this.xPos = x;
    this.yPos = y;
    //TODO 5. zavolat setPosition na hlavu a oko
    this._head.setPosition(xPos, yPos);
    this._eye.setPosition(getEyeX(), getEyeY());
    //paint();
  }

  public void erase() {
    //TODO 3. zavolat erase na oko a hlavu
    this._eye.erase();
    this._head.erase();
  }

  public void paint() {
    erase();
    this._head.paint();
    this._eye.paint();
    //TODO 4. zavolat paint na oko a hlavu
  }

  public void moveRight(int step) {
    if      (step>0) setDirection(Direction8.WEST);
    else if (step<0) setDirection(Direction8.EAST);
    else {}
    erase();
    setPosition(this.xPos + step, this.yPos);

  }

  public void moveDown(int step) {
    if      (step>0) setDirection(Direction8.NORTH);
    else if (step<0) setDirection(Direction8.SOUTH);
    else {}
    erase();

    setPosition(this.xPos, this.yPos + step);
  }

  private int getEyeSize() {
    return (int) getEyeSizeD();
  }

  private double getEyeSizeD() {
    return SIZE_OF_EYE_PORTION * SIZE;
  }

  private int computeAngle() {
    return 360 - ANGLE;
  }

  private int getEyeX() {
    switch (this.direction) {
      case EAST:
        return this.xPos + SIZE / 2 - getEyeSize() / 2 + getEyeSize() / 4;
      case WEST:
        return this.xPos + SIZE - getEyeSize() - SIZE / 2 + getEyeSize() / 2- getEyeSize() / 4;
      case NORTH:
      case SOUTH:
        return this.xPos + SIZE / 4;

      case NORTHEAST:
        return this.xPos + SIZE / 4 - getEyeSize() / 2 + getEyeSize() / 4;
      case NORTHWEST:
        return this.xPos + SIZE / 2  + getEyeSize() / 2;
      case SOUTHWEST:
        return this.yPos + SIZE - getEyeSize() - SIZE / 2  - getEyeSize();
        case SOUTHEAST:
        return this.xPos + SIZE / 4 + getEyeSize()*2 ;
      default:
        return 0;
    }

  }

  private int getEyeY() {
    switch (this.direction) {
      case EAST:
      case WEST:
        return this.yPos + SIZE / 4;
      case NORTH:
        return this.yPos + SIZE - getEyeSize() - SIZE / 2 + getEyeSize() / 2
                - getEyeSize() / 4;
      case SOUTH:
        return this.yPos + SIZE / 2 - getEyeSize() / 2 + getEyeSize() / 4;

      case NORTHEAST:
        return this.yPos + SIZE - getEyeSize() - SIZE / 2 + getEyeSize() / 2
                - getEyeSize() / 2;
      case NORTHWEST:
        return this.yPos + SIZE - getEyeSize() - SIZE / 2  - getEyeSize() / 2;
      case SOUTHWEST:
        return this.yPos + SIZE - getEyeSize() - SIZE / 2  - getEyeSize();
      case SOUTHEAST:
        return this.yPos + SIZE  - SIZE / 2- getEyeSize()*2-getEyeSize()/2;
      default:
        return 0;
    }
  }
  private void plotLineLow(int x0,int y0, int x1,int y1, int delay)throws InterruptedException {
    int dx = x1 - x0;
    int dy = y1 - y0;
    int yi = 1;
    if (dy< 0) {
      yi = -1;
      dy = -dy;
    }
    int D = 2 * dy - dx;
    int y = y0;
    for (int x = x0; x < x1; x++) {
      setPosition(x, y);
      if (D > 0) {
        y = y + yi;
        D = D - 2 * dx;
      }
      D = D + 2 * dy;
      Thread.sleep(delay);
      //System.out.println("line low");
    }
  }
  private void plotLineLowUp(int x0,int y0, int x1,int y1, int delay)throws InterruptedException {
    int dx = x1 - x0;
    int dy = y1 - y0;
    int yi = 1;
    if (dy< 0) {
      yi = -1;
      dy = -dy;
    }
    int D = 2 * dy - dx;
    int y = y0;
    //System.out.println("X0: "+x0+" y: "+y0+ "\nX1: "+x1+" y1: "+y+ " \ndx: "+dx+" dy: "+dy  );
    for (int x = x0; x >x1; x--) {
      setPosition(x, y);
      if (D > 0) {
        y = y + yi;
        D = D - 2 * dx;
      }
      D = D + 2 * dy;
      Thread.sleep(100);//delay);
      //System.out.println("line LUP");
    }
  }
  private void plotLineHigh(int x0,int y0,int x1,int y1, int delay) throws InterruptedException {
    int dx = x1 - x0;
    int dy = y1 - y0;
    int xi = 1;
    if (dx< 0) {
      xi = -1;
      dx = -dx;
    }
    int D = 2 * dx - dy;
    int x = x0;
    for (int y = y0; y < y1; y++) {
      setPosition(x, y);
      if (D > 0) {
        x = x + xi;
        D = D - 2 * dy;
      }
      D = D + 2 * dx;
      Thread.sleep(delay);        //todo tohle pujde modulovat a tim udelat krok
      //System.out.println("line high");

    }
  }
  private void plotLineHighUp(int x0,int y0,int x1,int y1, int delay) throws InterruptedException {
    int dx = x1 - x0;
    int dy = y1 - y0;
    int xi = 1;
    if (dx< 0) {
      xi = -1;
      dx = -dx;
    }
    int D = 2 * dx - dy;
    int x = x0;
    for (int y = y0; y >y1; y--) {
      setPosition(x, y);
      if (D > 0) {
        x = x + xi;
        D = D - 2 * dy;
      }
      D = D + 2 * dx;
      Thread.sleep(delay);        //todo tohle pujde modulovat a tim udelat krok
      //System.out.println("line HUP");
    }
  }

  private void plotLine(int x0,int y0,int x1,int y1, int delay) throws InterruptedException{
    choseDirection(x0, y0, x1, y1);
    if (abs(y1 - y0) < abs(x1 - x0)) {
      if (x0 > x1) {
        plotLineLowUp(x0, y0, x1, y1,  delay);
        System.out.println("1");

      } else {
        plotLineLow(x0, y0, x1, y1, delay);
        System.out.println("2");

      }
    }
    else{
      if (y0 > y1) {
        plotLineHighUp(x0, y0, x1, y1, delay);
        System.out.println("3");

      } else {
        plotLineHigh(x0, y0, x1, y1, delay);
        System.out.println("4");

      }
    }
  }

  private void choseDirection(int x0, int y0, int x1, int y1){
    if      (x0==x1 && y0==y1) exit();
    else if (x0==x1 && y0< y1) setDirection(Direction8.NORTH);
    else if (x0==x1 && y0> y1) setDirection(Direction8.SOUTH);
    else if (x0< x1 && y0==y1) setDirection(Direction8.WEST);
    else if (x0> x1 && y0==y1) setDirection(Direction8.EAST);

    else if (x0< x1 && y0< y1) setDirection(Direction8.NORTHWEST);
    else if (x0< x1 && y0> y1) setDirection(Direction8.SOUTHWEST);
    else if (x0> x1 && y0< y1) setDirection(Direction8.NORTHEAST);
    else if (x0> x1 && y0> y1) setDirection(Direction8.SOUTHEAST);
  }
  public  void animate(int x0, int y0, int x1, int y1, int x2, int y2, int move, int delay)throws InterruptedException{
    plotLine(x0, y0, x1, y1, delay);
    plotLine(x1, y1, x2, y2, delay);
    plotLine(x2, y2, x0, y0, delay);
  }
}
