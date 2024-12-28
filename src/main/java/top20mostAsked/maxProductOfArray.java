package top20mostAsked;

import java.util.Collections;
import java.util.HashSet;

public class maxProductOfArray {
    public static void main (String []args){

        int [] arr = {1,9,4,6,7};

        maxProduct(arr);
    }

    private static void maxProduct(int[] arr) {

        int product =0;
        HashSet<Integer> productSet  = new HashSet<>();

        for(int i =0 ; i<arr.length ; i++){
            for(int j =i+1; j<arr.length; j++){
                if(i==j){
                    continue;
                }
                product = arr[i] * arr[j];
                productSet.add(product);
            }
        }
        System.out.println(productSet );
        System.out.println(Collections.max(productSet ));

    }
}
