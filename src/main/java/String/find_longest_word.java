package String;

import java.util.Arrays;
import java.util.Scanner;

public class find_longest_word {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int max_length =0;
        String max_string = "";
        String[] arr = s.split(" ");
        for( String str : arr)        {
            if(str.length() > max_length){
                max_length = str.length();
                max_string = str;
            }
        }
        System.out.println(max_length + " " + max_string);
    }
}

