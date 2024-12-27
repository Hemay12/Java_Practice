package Map;

import java.util.HashMap;
import java.util.Map;

public class mapHashMap {
    public static void main (String [] args){

        Map<String,Integer> map = new HashMap<>();
        map.put("navin",12);
        map.put("harsh ",51);
        map.put("sushil",89);
        map.put("Kiran",74);
        map.put("Kiran", 33);

        System.out.println(map);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("AB",70);
        map2.put("BG", 100);
        map2.put("JH", 90);
        map2.put("KL", 100);

        System.out.println(map2);
     }
}
