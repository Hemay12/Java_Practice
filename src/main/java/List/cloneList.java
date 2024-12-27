package List;

import java.util.*;

public class cloneList {
    public static void main(String [] args){

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        List<String> new1 = (List<String>)((ArrayList<String>) list).clone();
        new1.remove("Banana");
        System.out.println(new1);
        list.retainAll(new1);
        System.out.println(list);
        list.set(0,"Banana");
        System.out.println(list);


        List<Integer> listint = new ArrayList<>();
        listint.add(10);
        listint.add(34);
        listint.add(154);
        listint.add(1);

//        Set<Integer> set = new HashSet<>(listint);

        int max = Collections.max(listint);
        System.out.println(max);

        Collections.shuffle(listint);
        System.out.println(listint);
        Collections.reverse(listint);
        System.out.println(listint);

        List<String> newlist = new ArrayList<>();
        newlist.add(null);
        newlist.add(null);

        Collections.copy(newlist,list);
        System.out.println(newlist);

    }
}
