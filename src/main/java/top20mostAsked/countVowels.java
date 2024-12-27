package top20mostAsked;

import java.util.Scanner;

public class countVowels {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : " );
        String str = sc.next();

        char [] arr = str.toCharArray();
        int count =0;
        for( char ch : arr){
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
               count ++;
           }
        }
        System.out.println("The count of vowel is " + count);
    }
}
