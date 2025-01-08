package Test;

import java.util.HashMap;
import java.util.Map;

public class characterOccurance {
    public static void main (String []args){

        String s = "kinnu";
        charOccurance(s);
    }

    private static void charOccurance(String s) {

        char [] arr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : arr){
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
}
