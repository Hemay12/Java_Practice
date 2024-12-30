package Array;

import java.util.HashSet;

public class removeDuplicates {
    public static void main (String [] args){

        int [] arr = {3,543,3,5,543,23,45};

        removeDuplicatesMethod(arr);
    }

    private static void removeDuplicatesMethod(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        System.out.println(set);
    }
}
