package sample;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

import java.awt.*;


public class Player extends Rectangle {
  private int posX;
  private int posY;
  private int moveSpeed;
  private Color color;
  private int size;
  final private int shape[][]={
          {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,1,0,0,0,0,0,0},
          {0,0,0,0,0,1,1,1,0,0,0,0,0},
          {0,0,1,1,1,1,1,1,1,1,1,0,0},
          {0,1,1,1,1,1,1,1,1,1,1,1,0},
          {0,1,1,1,1,1,1,1,1,1,1,1,0},
          {0,1,1,1,1,1,1,1,1,1,1,1,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0}};
  private javafx.scene.image.Image shipV = new Image("images/player.png");
  ImageView ship = new ImageView(shipV);



  public void print(){

  }


  Player(int posX, int posY, int moveSpeed, Color color, int size){
    //super(2*size, 2*size, color);
    this.posX=posX;
    this.posY=posY;
    this.moveSpeed=moveSpeed;
    this.color=color;
    this.size=size;
    setTranslateX(posX);
    setTranslateY(posY);
  }

  void moveRight(){
    setTranslateY(getTranslateX()+moveSpeed);
  }
  void moveLeft(){
    setTranslateY(getTranslateX()-moveSpeed);
  }

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }

  public void setMoveSpeed(int moveSpeed) {
    this.moveSpeed = moveSpeed;
  }
}
