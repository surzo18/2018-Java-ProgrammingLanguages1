package cz.kozusznik.pl1.lab09;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;

public class OccurencesComparator {
  public static ArrayList<String> sort (ArrayList<String> al, Map<String, Integer> occu){

    ArrayList<String> test = new ArrayList<>();
    ListIterator<String> iter = al.listIterator();

    while (!al.isEmpty()) {
      String s = al.get(iter.nextIndex());
      String highest = al.get(iter.nextIndex());

      for (String other : al) {
        if (occu.get(highest) < occu.get(other)) {
          highest = other;
        }
      }

      if(!s.equals(highest)) {
        al.set(al.indexOf(highest), s);
        al.set(iter.nextIndex(), highest);
      }
      test.add(highest);
      iter.next();
      iter.remove();
    }


    return test;
  }
}
