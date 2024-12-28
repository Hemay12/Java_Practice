package top20mostAsked;

import java.util.Arrays;

public class mergeTwoSortedArray {
    public static void main (String [] args){

        int [] arr = {11,34,35,2345,1,42};
        Arrays.sort(arr);
        int [] arr2 = {334,4,453,654,934};
        Arrays.sort(arr2);

        System.out.println(arr[0]);
        int sum = arr.length + arr2.length;
        int [] arr3 = new int[sum];

        for(int i =0 ; i<arr.length; i++){
            arr3[i] = arr[i];
        }
        int j =0;
        for(int i =arr.length ; i<arr3.length ; i++){
            arr3[i] = arr2[j];
            j++;
        }

        Arrays.sort(arr3);

        for (int i = 0; i < sum; i++) {
            System.out.println("Element at index "
                    + i + " : " + arr3[i]);
        }
    }
}
