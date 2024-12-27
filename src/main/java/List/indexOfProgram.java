package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class indexOfProgram {
    public static void main (String [] args){
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        System.out.println(list.indexOf("cherry"));
        System.out.println(list.contains("Apple"));

        List<Integer> liist = new ArrayList<>();
        liist.add(10);
        liist.add(30);
        liist.add(20);
        liist.add(5);
        System.out.println(liist);
        liist.remove(liist.indexOf(30));
        System.out.println(liist);

        Collections.sort(liist);
        System.out.println(liist);

//        String arr[] = list.toArray(new String[0]);
//        for(String str : arr){
//            System.out.println(str);
//        }
    }
}
