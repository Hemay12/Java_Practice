package String;

import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();

        System.out.println("Enter the 1st String : " + str);
        System.out.println("Enter the 2nd String : " + str2 );

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        if(arr.length == arr2.length){
            boolean isAnagram = true;
            for(int i =0 ; i<arr.length ; i++){
                if(arr[i] != arr2[i] ) {
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
        else{
            System.out.println("Not Anagram");
        }

//        str = str.replaceAll("s","");
//        System.out.println(str);

//        String str3 = "This a easy program";
//        String [] arr3 = str3.split(" ");
//        System.out.println("The number od words in the above string is : "+ arr3.length);

        System.out.println(digitcontain(sc.next()));
    }

    private static boolean digitcontain(String s) {
        boolean x = false;
        try {
            int tx = Integer.parseInt(s);
            x= true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return x;
    }

}
