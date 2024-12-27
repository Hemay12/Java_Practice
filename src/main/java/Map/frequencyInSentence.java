package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequencyInSentence {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String words : arr){
            map.put(words , map.getOrDefault(words, map.getOrDefault(words,0))+1);
        }


        System.out.println(map);
    }
}
