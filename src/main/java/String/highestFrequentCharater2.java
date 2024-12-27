package String;

import java.util.Scanner;

public class highestFrequentCharater2 {
    public static void main (String [] args){

        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char max_char = '\0';
        int max =0;

        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);

            int count =0;
            for(int j =0; j<str.length(); j++){
                if(str.charAt(j) == ch){
                    count ++;
                }
            }

            if( count>max ){
                max= count;
                max_char = ch;
            }
        }

        System.out.println(max + " " + max_char);
    }
}
