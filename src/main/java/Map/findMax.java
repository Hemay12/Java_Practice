package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class findMax {
    public static void main(String [] args){

        Map<String, Integer> map = new HashMap<>();
        map.put("navin",12);
        map.put("harsh ",51);
        map.put("Kiran", 33);

        int max=0;
        String maxKey = "";
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                maxKey = e.getKey();
            }
        }
        System.out.println(max + " " + maxKey);
    }
}
