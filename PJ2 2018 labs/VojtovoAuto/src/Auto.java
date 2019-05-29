
public class Auto {
  private int numberOfWeels;
  private double size;
  private double objemKola;
  private int posX;
  private int posY;

  Auto(int numberOfWeels2, int size, int posX, int posY) {
    this.numberOfWeels = numberOfWeels2;            //2 zavola se tenhle konstruktor a vyplni se hodnota promenne
    this.objemKola = objemKola(size);
    this.posX=posX;
    this.posY=posY;
  }

  public void go(int x, int y) {
    this.posX=x;
    this.posY=y;

  }
  public void printPos(){
    System.out.println("X:" +this.posX);
    System.out.println("Y:" +this.posY);

  }
  private double objemKola(double size2) {
    return 2 * 3.14 * size2 * 3;                    // 3: 2*pi*size* moje sirka kola
  }
}
