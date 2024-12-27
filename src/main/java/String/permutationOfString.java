package String;

import java.util.Scanner;

public class permutationOfString {
    public static void main (String [] args){
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(str.length()>5){
            System.out.println("Pehle tum batao kitne strings possible hai.");
        }
        char [] arr = str.toCharArray();
        String joie="";

        for(int i=0; i<arr.length ; i++){
            char ch = str.charAt(i);
            joie = Character.toString(ch);

            for (int j =i+1; j<arr.length-1 ; j++){
                joie = joie + str.substring(j);
                System.out.println(joie);
            }
        }

    }
}
