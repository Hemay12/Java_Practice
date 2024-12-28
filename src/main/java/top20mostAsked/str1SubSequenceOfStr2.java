package top20mostAsked;

import java.util.Scanner;

public class str1SubSequenceOfStr2 {
    public static void main (String [] args){

        System.out.println("We will check that str1 is subsequence of str2 or not. Enter string accordingly");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the String 1 :");
        String str1 = sc.next();
        System.out.print("\nEnter the String 2 :");
        String str2 = sc.next();

        checkSubSequence(str1, str2);
    }

    private static void checkSubSequence(String str1, String str2) {

        int k =0;

        for(int i =0; i<str1.length() && k <str2.length(); i++){
           if(str1.charAt(i) == str2.charAt(k)){
               k++;
           }
        }

        if(k == str1.length()){
            System.out.println("str1 is subsequence of str2");
        }
        else{
            System.out.println("str1 is NOT subsequence of str2");
        }
    }
}
