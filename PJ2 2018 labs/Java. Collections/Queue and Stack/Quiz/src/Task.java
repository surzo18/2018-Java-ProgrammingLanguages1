// you can experiment here, it won't be checked
import java.util.*;

class Task {
  public static void main(String[] args) {
    Deque<String> states = new ArrayDeque<String>();

    states.add("Germany");
    states.add("France");
    states.push("UK");
    states.offerLast("Norway");

    String sFirst = states.pop();
    String s = states.peek();
    String sLast = states.peekLast();
    states.offer(sFirst);
    String s1 = states.pollLast();

    while (states.peek() != null) {
      System.out.print(states.pop());
    }  }
}
