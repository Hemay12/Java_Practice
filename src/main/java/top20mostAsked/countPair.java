package top20mostAsked;

import java.util.*;

public class countPair {
    public static void main(String args[]) {
        int[] arr = {1, 1, 1, 1, 1, 2, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> llist = new ArrayList<>();

        for (int a : arr) {
            list.add(a);
        }
        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        int pair = 0;

        while (it.hasNext()) {
            int a = it.next();

            if (llist.contains(a)) {
                pair++;
                llist.remove(Integer.valueOf(a));
            }
            else{
                llist.add(a);
            }
        }

        System.out.println(pair);

    }
}
