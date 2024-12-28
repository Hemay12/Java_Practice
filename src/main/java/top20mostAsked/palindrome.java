package top20mostAsked;

import java.util.Scanner;

public class palindrome {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();

        checkPalindrome(str);
    }

    private static void checkPalindrome(String str) {

        if(str.length() %2 ==0){
            System.out.println("Not Palindrome");
        }

        StringBuilder sb = new StringBuilder();
        char [] chh = str.toCharArray();
        for(int i =chh.length-1 ; i>=0; i--){
            sb.append(chh[i]);
        }

        if(str.equals(sb)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
