package pl1.shapes;

import pl1.types.MyColor;

public class Car {
  private MyColor color= MyColor.BLUE;
  private int x=0;
  private int y=0;
  public Car(int x, int y, MyColor color, int wight, int heigh){
    new Rectangle(x+11, y+135, 80,20, color);             //spodek auta
    new Rectangle(x+35, y+123, 30,12, MyColor.AZURE);     //okno
    new Ellipse(x+20,y+150,10,10, MyColor.BLACK);         //predni kolo
    new Ellipse(x+70,y+150,10,10, MyColor.BLACK);         // zadni kolo
    new Rectangle( x+50, y+123, 2, 12, color);            //sloupek
  }
}
