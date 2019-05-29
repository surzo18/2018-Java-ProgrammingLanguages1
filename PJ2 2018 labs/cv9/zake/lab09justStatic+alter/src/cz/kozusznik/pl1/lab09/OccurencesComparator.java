package cz.kozusznik.pl1.lab09;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class OccurencesComparator {
    public static ArrayList<String> sort (ArrayList<String> al, Map <String, Integer> occu){

       /* Map<String, Integer> sorted = occu.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
        ArrayList<String> yp = new ArrayList<>(sorted.keySet());
        System.out.println(yp);*/

        ArrayList<String> test = new ArrayList<>();
        ListIterator <String> iter = al.listIterator();
        int where = 0;

        while (!al.isEmpty()) {
            String s = al.get(((ListIterator<String>) iter).nextIndex());
            String highest = al.get(((ListIterator<String>) iter).nextIndex());

            for (String other : al) {
                if (occu.get(highest) < occu.get(other)) {
                    highest = other;
                }
                where++;
            }

            if(s != highest) {
                al.set(al.indexOf(highest), s);
                al.set(((ListIterator<String>) iter).nextIndex(), highest);
            }
            where = 0;
            test.add(highest);
            iter.next();
            iter.remove();
        }


        return test;
    }


    /*useless
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }*/

}
