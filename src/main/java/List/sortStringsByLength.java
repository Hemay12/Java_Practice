package List;

import java.util.*;

public class sortStringsByLength {
    public static void main(String [] args){

        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Kiwi");
        list.add("Grapes");
        list.add("Mango");
        System.out.println(list);

        Collections.sort(list, Comparator.comparingInt(String :: length));
        System.out.println(list);

    }
}
