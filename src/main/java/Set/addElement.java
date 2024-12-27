package Set;

import java.util.*;

public class addElement {
    public static void main (String [] args){

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(3);
        set2.add(4);
        set2.add(7);

        Iterator<Integer> it = set2.iterator();

        Set<Integer> set3 = new HashSet<>(set);
        set3.addAll(set2);
        set3.removeAll(set);
        System.out.println(set3);

    }
}
