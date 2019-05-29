package cz.kozusznik.pl1.lab10;

import cz.kozusznik.pl1.utils.IORoutines;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args){
    /*Html text=new Html();
    System.out.println("pocet Acek:" + text.numA());
    System.out.println("pocet malych samohlasek:\t" + text.numMalychSamohlasek());
    System.out.println("pocet velkych samohlasek:\t" + text.numVelkychSamohlasek());
    System.out.println("pocet vsech samohlasek:\t\t" + text.numSamohlasek());
    System.out.println("pocet fei a css:\t\t\t" + text.numOfStarecMore());



    Html html = new Html();
    String data =html.toString();

    String regex = "href=\"http[s]?:\\/\\/\\S+[\"]";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(data);
    int cnt = 0;
    while (matcher.find()) {
      cnt++;
      System.out.println("found: " + cnt + " : " + data.substring(matcher.start(), matcher.end()));
    }
    System.out.println("Number of hrefs: " + cnt);*/


    /**************
     ****** 1******
     **************/

    Book book =new Book();
    String bData = book.toString();
    int len=book.numOfWord();

    for (int i = 0; i < len; i++) {
      String tmp=new StringBuilder(book.words[i]).reverse().toString();
      if (book.words[i].length()>1 && book.words[i].equals(tmp)){
        System.out.println(book.words[i]);
      }
    }

    /***************
     *******2*******
     ***************/
    /*String read = IORoutines.readFile("shit.html");
    System.out.println(read);*/

    String rp = IORoutines.readPage("https://wonderfulengineering.com/50-nature-wallpapers-hd-for-free-download/");
    //System.out.println(rp);
    String[] words=rp.split("[\" ,'?]+");
    List<Pic> pics= new ArrayList<>();
    int i=0;
    String tmp;
    int flagA=0;
    String alt=null, url=null;
    int height=0, width=0;
    for (int j = 0; j <words.length ; j++) {
      tmp=words[j];
      //System.out.println(tmp);
      if ( tmp.length()>3 && tmp.substring(0, 4).equals("src=")){
        tmp=words[++j];
        url= tmp;
        flagA=+1;
        continue;
      }
      if (tmp.length()>3 && tmp.substring(0,4).equals("alt=")){
        tmp=words[++j];
        while (true){
          if (words[++j].indexOf('=')<0){
            --j;
            break;
          }
          tmp=tmp.concat(" " + words[j]);
        }

        alt=tmp;
        flagA+=2;
        continue;
      }
      if (tmp.length()>6 && tmp.substring(0,7).equals("height=") && alt!=null){
        tmp=words[++j];
        height=Integer.parseInt(tmp);
        flagA+=4;
        continue;
      }
      if (tmp.length()>5 && tmp.substring(0,6).equals("width=")&& alt!=null){
        tmp=words[++j];

        width = Integer.parseInt(tmp);
        flagA+=8;
        continue;
      }
      if (flagA==15 && url!=null && alt!=null && height!=0 && width!=0){
        Pic pc = new Pic(url, alt, (height*width));
        pics.add(pc);
        flagA=0;
        url=alt=null;
        height=width=0;
      }
    }

    for (Pic pic : pics) {
      System.out.println(pic.alt);            //pics.get(j).getUrl() + " "
    }




//
//    while(true){
//      tmp=words[i];
//      if (tmp.substring(0, 3).equals("alt=")){
//        flagA=1;
//        System.out.println("povedlo se");
//      }
//      ++i;
//      if (words[i]==null){
//        break;
//      }
//    }



  }
}
