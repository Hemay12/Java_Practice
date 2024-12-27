package top20mostAsked;

import java.util.Scanner;

public class FirstAndLastOccurence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        System.out.println("Enter the string you want the first and last occurence :");
        String ch = sc.next();

        int startString = str.indexOf(ch);
        int lastString = str.lastIndexOf(ch);
        System.out.println(startString + " " + lastString);

    }
}
