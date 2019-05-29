package cz.kozusznik.pl1.lab10;

public class Pic {
  public String url;
  public String alt;
  public int size;
  Pic(String url, String alt, int size){
    this.url=url;
    this.alt=alt;
    this.size=size;
  }

  public String getUrl() {
    return url;
  }
}
