package shapes;


import pl1.shapes.Ellipse;
import pl1.shapes.Rectangle;
import pl1.shapes.Triangle;
import pl1.types.MyColor;

public class EllipseInRectangle {
    private int posX=0;
    private int posY=0;
    private int sizeX=50;
    private int sizeY=50;

    pl1.shapes.Ellipse el;
    pl1.shapes.Rectangle rect;

    public EllipseInRectangle(int posX, int posY, int sizeX, int sizeY){
        this.posX=posX;
        this.posY=posY;
        this.sizeX=sizeX;
        this.sizeY = sizeY;
        print();

    }
    public EllipseInRectangle(int posX, int posY){
        this.posX=posX;
        this.posY=posY;
        print();

    }
    public EllipseInRectangle(){
        print();
    }
    public void erase(){
        rect.erase();
    }
    public void setPosition(int posX, int posY){
        this.posX=posX;
        this.posY=posY;
    }
    public void print (){
        rect=new Rectangle(this.posX, this.posY, this.sizeX, this.sizeY, MyColor.BLUE);
        el= new Ellipse(this.posX, this.posY, this.sizeX, this.sizeY, MyColor.GOLDEN);
    }

}
