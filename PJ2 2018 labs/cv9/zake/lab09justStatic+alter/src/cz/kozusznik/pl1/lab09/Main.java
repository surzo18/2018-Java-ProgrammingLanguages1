package cz.kozusznik.pl1.lab09;

import cz.kozusznik.pl1.shapes.tools.IMovable;

import java.util.*;

public class Main{
    public static void main(String[] args) {

        Book huh = new Book ();
        Collection <String> sup = huh.getWords();

        ArrayList <String> hey =new ArrayList(LowerNoDupli(sup));
        //System.out.println(hey);

        Map<String, Integer> hoy = nameIt(sup);
        //System.out.println(hoy);

        System.out.println(OccurencesComparator.sort(hey, hoy));

    }

    public static Set<String> LowerNoDupli(Collection <String> sup){
        Set<String> s = new HashSet<>();

        for (String what: sup){
            what=what.toLowerCase();
            s.add(what);
        }
        return s;
    }

    public static Map<String,Integer> nameIt(Collection <String> sup){
        Map<String, Integer> counted = new HashMap <>();
        for (String i: sup){
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



    /*
        public static double sum (List < ? extends Number > list){
            double sum = 0.0;
            for (Number i : list) {
                //sum+=i.doubleValue();
            }
            return sum;
        }

        public static void printOnlyIntegerClassorSuperClass(List <?> welp){
        }


        List<Integer> list3 = Arrays.asList (4,5,6,7);
        List<String> list5 = Arrays.asList("one", "two", "three");

        Collection<Integer> randomNumber = new RadnomGenerator(10,20).generateNumbers(20);
        HashSet<Integer> set = new HashSet<> (randomNumber);
        System.out.println(set.size());
        //HashMap <Integer, Integer> hashmap =;

       /* private static Map <Integer, Integer> countNumbers (Collection <Integer> collection){
            Map<Integer, Integer> counted = new HashMap <~>();
            for (Integer i: collection){
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

        ArrayList<Integer> toSort = new ArrayList <> (randomNumber);
        Collections.sort(toSort, Collections.reverseOrder());
        for (Integer number: toSort){
            System.out.println(number);
        }
        System.out.println("Sorted");

    }
    ArrayList <IMovable> mobales = new ArrayList<>();
    seridte pole imovable podle x a y pozice
    */

