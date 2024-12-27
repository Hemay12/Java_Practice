package Set;

import java.util.HashSet;
import java.util.Set;

public class subSet {
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

        if(set2.containsAll(set)){
            System.out.println("true");;
        }
        else{
            System.out.println("false");
        }

    }
}
