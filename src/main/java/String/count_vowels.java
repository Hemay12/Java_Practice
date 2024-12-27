package String;

import java.util.Scanner;

public class count_vowels {
    public static void main (String args[]){
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;

        char arr[] = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o'){
               count++;
            }
        }
        System.out.println(count);
    }
}
