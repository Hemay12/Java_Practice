package Set;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDifference {
    public static void main (String [] args){

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(6);
        set2.add(7);
        set2.add(3);
        set2.add(4);
        set2.add(5);

//        set.addAll(set2);                         //UNION
//        System.out.println("Union is " + set);

        set.retainAll(set2);                      //INTERSECTION
        System.out.println("Intersection is set "+ set);

//        Set<Integer> set3 = new HashSet<>(set);    //DIFFERENCE
//        set3.addAll(set2);
//        Set<Integer> set4 = new HashSet<>(set2);
//        set4.retainAll(set);
//        set3.removeAll(set4);
//        System.out.println(set3);

    }
}
