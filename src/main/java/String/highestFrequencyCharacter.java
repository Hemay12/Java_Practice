package String;

import java.util.Scanner;

public class highestFrequencyCharacter {
    public static void main(String[] args) {

        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int max = 0;
        char maxChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            char ch = str.charAt(i);

            String str2 = str;
            while (str2.indexOf(ch) - str2.lastIndexOf(ch) != 0) {
                str2 = str2.substring(str2.indexOf(ch) +1);
                count++;
            }

            if(max<count){
                max=count;
                maxChar = ch;
            }
        }
        System.out.println(max + " " + maxChar);
    }
}

