package String;

import java.util.Scanner;

public class unique_characters {
    public static void main (String [] args){

        System.out.println("Enter the Stirng");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String result = "";

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(result.indexOf(ch) == -1){
                result +=ch;
            }
        }
        System.out.println(result);
    }
}
