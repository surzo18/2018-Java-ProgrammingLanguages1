public class House {
  private  Triangle _roof;
  private  Rectangle _walls;
  private Rectangle _chimney;

  public House(){
    this._walls  = new Rectangle(25, 45, 50, 50, MyColor.BRICKY);
    this._chimney= new Rectangle(25, 45, 50, 50, MyColor.BRICKY);
    this._roof   = new Triangle();
  }
  public void moveRight(int step){
    this._chimney.moveRight(step);
    this._walls.moveRight(step);
    this._roof.moveRight(step);
  }

  public void moveDown(int step){
    this._chimney.moveDown(step);
    this._walls.moveDown(step);
    this._roof.moveDown(step);
  }
  public int getX(){
    return this._roof.getX();
  }
  public  int getY(){
    return this._roof.getY();
  }
  public void setPosition(int x, int y){
    this._walls.setPosition(x, y);
    this._roof.setPosition(x, y-_walls.getHeight());

  }
}