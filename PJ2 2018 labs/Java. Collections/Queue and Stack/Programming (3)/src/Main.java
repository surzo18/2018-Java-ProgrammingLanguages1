import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scan = new Scanner(System.in);
    Deque<Integer> list = new ArrayDeque<>();
    String slenght, sTmp;
    slenght=scan.next();
    for (int i = 0; i < Integer.parseInt(slenght); i++) {
      sTmp=scan.next();
      list.add(Integer.parseInt(sTmp));
    }
    System.out.println(list);
    for (int i = 0; i < Integer.parseInt(slenght); i++) {
      if(list.peekLast()%2==0){
        System.out.println(list.peekLast());
      }
    }
  }
}