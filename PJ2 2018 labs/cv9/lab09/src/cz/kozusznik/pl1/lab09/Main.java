package cz.kozusznik.pl1.lab09;

import java.util.*;

public class Main {
    public static void main (String[] args){
        Book garbage = new Book ();
        Collection <String> sup = garbage.getWords();

        ArrayList<String> hey =new ArrayList<>(toLower(sup));
        //System.out.println(hey);

        Map<String, Integer> hoy = countNumbers(sup);
        //System.out.println(hoy);

        System.out.println(OccurencesComparator.sort(hey, hoy));


    }
    public  static double sum(List<? extends Number> list){
        double sum=0.0;
        for (Number i:list) {
            sum+=i.doubleValue();
        }
        return sum;
    }

    private static Set<String> toLower(Collection <String> collection){
        Set<String> s = new HashSet<>();

        for (String what: collection){
            what=what.toLowerCase();
            s.add(what);
        }
        return s;
    }
    private static Map<String,Integer> countNumbers(Collection <String> collection){
        Map<String, Integer> counted = new HashMap<>();
        for (String i: collection){
            i = i.toLowerCase();
            if (!counted.containsKey(i)){
                counted.put(i, 1);
            }
            else{
                Integer count = counted.get(i);
                counted.put(i, count+1);
            }
        }
        return counted;
    }


}
