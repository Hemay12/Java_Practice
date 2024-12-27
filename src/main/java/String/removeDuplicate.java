package String;

import java.util.Scanner;

public class removeDuplicate {
    public static void main (String [] args){

        System.out.println("Enter the string to remove duplicate");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char [] arr = str.toCharArray();
        String s2 = "";

        for(char ch : arr){
            if(!s2.contains(Character.toString(ch))){
                s2 = s2 + Character.toString(ch);
            }
        }
        System.out.println(s2);
    }
}
