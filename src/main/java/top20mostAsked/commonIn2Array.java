package top20mostAsked;

import java.util.HashSet;
import java.util.Set;

public class commonIn2Array {
    public static void main (String [] args){

        int arr []= {1,2,3,4};
        int [] arr2 = {3,4,5,6};

        findcommon(arr, arr2);
    }

    public static void findcommon(int[] arr , int [] arr2){

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i =0; i<arr.length ; i++){
            set1.add(arr[i]);
        }

        for(int i =0; i<arr2.length ; i++){
            set2.add(arr2[i]);
        }

        set1.retainAll(set2);
        System.out.println(set1);
    }
}
