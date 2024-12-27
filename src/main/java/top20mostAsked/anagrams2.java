package top20mostAsked;

import java.util.Arrays;
import java.util.Scanner;

public class anagrams2 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1 : ");
        String str = sc.next();
        System.out.println("Enter the String2 :");
        String str2 = sc.next();

        char [] arr1 = str.toCharArray();
        Arrays.sort(arr1);

        char [] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        boolean x = true;
        if(arr1.length == arr2.length){
            for(int i =0 ; i<arr1.length ; i++){
                if(! (arr1[i] == arr2[i])){
                    x=false;
                    break;
                }
            }
            if(x){
                System.out.println("Anagram");
            }
            else {
                System.out.println("Not Anagram");
            }
        }
        else {
            System.out.println("Not Anagram");
        }

        System.out.println("Anagram :" + x );
    }
}
