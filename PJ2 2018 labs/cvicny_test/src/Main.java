import jdk.nashorn.api.scripting.URLReader;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;

public class Main {
  public static void main (String args[]) throws Exception  {





  OsobniAuto auto =new OsobniAuto("wtf", "2f2 222", 5);
  NakladniAuto nakladak=new NakladniAuto("tmp", "MAN 1223", 20000);
  auto.prepravuj();
  nakladak.jed();

  /**********************3**********************************/
  String url=IORoutines.readPage("http://blender.vsb.cz/supported-methods/");
  //String[] tmp=url.split("<img\\s.*src\\s*=\\s*\"([^\"]*)\".*>");
  String regex="<img\\s.*src\\s*=\\s*\"([^\"]*)\".*>";
  Pattern pattern= Pattern.compile(regex);
  Matcher matcher=pattern.matcher(url);
  int begin=0, end;
  int flagBegin=0;
  int i=0;
  while (matcher.find()){
    //System.out.println(url.substring(matcher.start(), matcher.end()));
    while (true){
      if (url.charAt(matcher.start()+i)=='\"' && url.charAt(matcher.start()+i+1)=='h' && flagBegin==0){
        flagBegin=1;
        begin=matcher.start()+i+1;
      }
      else if (url.charAt(matcher.start()+i)=='\"' && flagBegin==1){
        flagBegin=0;
        end=matcher.start()+i;
        i=0;
        break;
      }
      i++;
    }
//    System.out.println(url.substring(begin, end));
    String separatedUrlString=url.substring(begin, end);
    URL separatedUrl= new URL(separatedUrlString);
    int beginFile=separatedUrlString.length()-1;
    int endFile=separatedUrlString.length();
    while (true){
      if (separatedUrlString.charAt(beginFile)=='/'){
        ++beginFile;
        break;
      }
      beginFile--;
      if (beginFile==begin){
        System.out.println("se zesralo");
        break;//tak tu se to posere
      }

    }
    BufferedImage image=null;
    //System.out.println(separatedUrlString);
    try{image = ImageIO.read(separatedUrl);
      File outputfile = new File(separatedUrlString.substring(beginFile, endFile));
      ImageIO.write(image, "png", outputfile);
    }
    catch (IOException e){
      System.out.println("a zase je to v prdeli \t"+e);
    }

  }


  /*************************4************************************/
    try (FileInputStream in = new FileInputStream("Faust-Goethe.txt")) {
      BufferedReader read = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
      String tmp;
      String book="";
      while ((tmp=read.readLine())!=null){
        book+=tmp;
      }
      String[] explodedGoethe = book.split("[\" ,'?]+");
      int numberOfGoethesPieces = explodedGoethe.length;
      System.out.println(numberOfGoethesPieces);
    }






  //System.out.println(url);
  }

}
