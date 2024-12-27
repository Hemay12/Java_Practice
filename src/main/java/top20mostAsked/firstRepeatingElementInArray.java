package top20mostAsked;

import java.util.HashSet;

public class firstRepeatingElementInArray {
    public static void main(String [] args){

        int [] arr = {2,3,45,4,3,35,6,3,5,6};

        printFirstRepeating(arr);
    }

    static void printFirstRepeating(int[] arr) {

        int min=0;

        HashSet<Integer> set = new HashSet<>();

        for(int i=arr.length -1; i>=0;i--){
            if(set.contains(arr[i])){
                min =i;
            }
            else{
                set.add(arr[i]);
            }
        }

        System.out.println(arr[min]);
    }
}
