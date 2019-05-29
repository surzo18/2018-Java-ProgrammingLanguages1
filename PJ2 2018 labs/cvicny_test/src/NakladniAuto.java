public class NakladniAuto extends Auto{
  private int hmotnostNakladu;
  NakladniAuto(String typ, String spz, int hmotnostNakladu){
    super(typ, spz);
    this.hmotnostNakladu=hmotnostNakladu;
  }
  @Override
  public void jed(){
    super.jed();
    System.out.println(this.hmotnostNakladu +" kg");
  }
}
