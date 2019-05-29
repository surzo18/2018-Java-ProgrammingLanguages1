public class Auto {
  private String typ;
  private String SPZ;
  Auto(String typ, String spz){
    this.typ=typ;
    this.SPZ=spz;
  }
  public void jed(){
    System.out.print(this.typ+ ", " + this.SPZ+": jede a veze ");
  }

}
