package String;

import java.util.Scanner;

public class check_palindrome {
    public static void main (String args[]){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean x= palindrome(str);
        System.out.println(x);

        System.out.println(replace_string(str));
    }
    public static boolean palindrome (String s){
        int j =s.length()-1;
        boolean y = false;
        for(int i = 0; i<s.length(); i++, j--){
          char ch = s.charAt(i);
          char ch2 = s.charAt(j);
          if(ch == ch2 && i!=j){
               y = true;
          }
        }
        return y;
    }

    public static String replace_string (String str){
        return str.replaceAll("p","b");
    }
}
