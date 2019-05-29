public class OsobniAuto extends Auto implements PrepravaOsob {
  private int pocetOsob;
  OsobniAuto(String typ, String spz){
    super(typ, spz);
  }
  OsobniAuto(String typ, String spz, int pocetOsob){
    super(typ, spz);
    this.pocetOsob=pocetOsob;
  }
@Override
  public void jed(){
    super.jed();
    System.out.println(this.pocetOsob+" osob");
  }

  @Override
  public void prepravuj() {
    jed();
  }
}
