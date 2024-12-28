package top20mostAsked;

import java.util.HashSet;
import java.util.Set;

public class secondLargestInArray {
    public static void main(String [] args){

        int [] arr = {2,3,45,4,3,35,6,3,5,6};
        printSecondLargestInArray(arr);
        printSecondLargestInArraySid(arr);
    }

    static void printSecondLargestInArraySid(int[] arr) {

        for(int a: arr){
            System.out.print(a + "\t");
        }
        int largest =0;
        int secondlargest=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            else if (arr[i] > secondlargest) {
                secondlargest =arr[i];
            }
        }

        System.out.println("\nLargest is :"+largest + " Second largest is :" + secondlargest);
    }

    static void printSecondLargestInArray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int max=0;
        for(int a :arr){
            set.add(a);
            if(a>max){
                max=a;
            }
        }
        set.remove(max);
        System.out.println(set);
        int smax=0;

        for(int a :set){
            if(a>smax){
                smax=a;
            }
        }
        System.out.println(smax);
    }
}
