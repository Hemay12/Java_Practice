package String;

import java.util.Scanner;

public class longestStringWithoutDuplicate {
    public static void main (String [] args){

        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char [] arr = str.toCharArray();
        String s2 = "";
        int max=0;

        for(char ch : arr){

            if(!s2.contains(Character.toString(ch))) {
                s2 = s2 + ch;
            }
            else{
                if(max<s2.length()){
                    max =s2.length();
                    System.out.println(max + " " +s2);
//                    int duplicateIndex = s2.indexOf(ch);
//                    s2 = s2.substring(duplicateIndex + 1) + ch;
                    s2 = "";
                    System.out.println(s2.isEmpty());

                }
            }

        }
        if (max < s2.length()) {
            max = s2.length();
            System.out.println(max + " " + s2);  // Print final longest unique substring
        }

    }
}
