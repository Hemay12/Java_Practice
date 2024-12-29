package top20mostAsked;

import java.util.*;

public class printPairWithGivenSum {
    public static void main (String [] args){

        int arr[] = { 1, 5, 7, -1, 5 };
        int givenSum = 6;
        int pair =0;

       for(int i=0; i<arr.length ; i++){

           for(int j=i+1; j<arr.length;j++){
               if(arr[i] + arr[j] == givenSum){
                   pair++;
               }
           }
       }
        System.out.println(pair);
    }
}
