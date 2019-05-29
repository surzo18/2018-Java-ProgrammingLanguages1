import java.util.ArrayList;
import java.util.List;
public class Main {

  public static void main(String[] args) {
    List<Integer> myList= new ArrayList<>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);
    myList.add(6);
    myList.add(7);

    for (Integer aMyList : myList) {
      if (aMyList % 2 == 0) {
        System.out.println(aMyList);

      }

      //put your code here
    }
}