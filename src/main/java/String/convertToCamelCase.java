package String;

import java.util.Scanner;

public class convertToCamelCase {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        camelcase(s);
    }

    public static void camelcase(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word.substring(0,1).toUpperCase())
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
