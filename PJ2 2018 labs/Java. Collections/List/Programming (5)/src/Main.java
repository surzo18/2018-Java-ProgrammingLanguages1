import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    List<String> list = new ArrayList<>();
    String tmp=scanner.nextLine();
    String[] save= tmp.split(" ");
    Collections.addAll(list, save);
    System.out.println(list);
    //put your code here
  }
}