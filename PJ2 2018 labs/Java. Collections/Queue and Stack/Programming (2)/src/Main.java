import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    Deque <Integer> fronta = new ArrayDeque<>();
    String tmp, lenght;

    lenght=scanner.next();
    for (int i = 0; i <Integer.parseInt(lenght) ; i++) {
      tmp=scanner.next();
      fronta.add(Integer.parseInt(tmp));
    }
    //fronta.removeFirst();
    //System.out.println(fronta);
    for (int i = 0; i < Integer.parseInt(lenght); i++) {
      System.out.println(fronta.pollLast());
    }
  }
}