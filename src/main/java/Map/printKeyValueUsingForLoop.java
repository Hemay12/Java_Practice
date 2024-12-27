package Map;

import java.util.HashMap;
import java.util.Map;

public class printKeyValueUsingForLoop {
    public static void main (String [] args){

        Map<String,Integer> map = new HashMap<>();
        map.put("navin",12);
        map.put("harsh",51);
        map.put("sushil",89);
        map.put("Kiran",74);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }
    }
}
