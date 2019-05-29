package pl1.lab03;

public class QuadraticEquation {
  private double _x1;
  private double _x2;

  public QuadraticEquation(double a, double b, double c){
    this._x1=(-b+Math.sqrt(discriminant(a, b, c)))/(2*a);
    this._x1=(-b-Math.sqrt(discriminant(a, b, c)))/(2*a);

  }
  public double getX1(){
    return _x1;
  }
  public double getX2(){
    return _x2;
  }

  public void setX1(double _x1){
    this._x1=_x1;
  }
  public void setX2(double _x2){
    this._x2=_x2;
  }
  private double discriminant(double a, double b, double c){
    return Math.pow(b, 2)-(4*a*c);
  }
  public int numberOfSolutions(double a, double b, double c){
    double D=discriminant(a, b, c);
    if      (D>0)  return 2;
    else if (D==0) return 1;
    else           return 0;
  }
}
