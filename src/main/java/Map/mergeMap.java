package Map;

import java.util.HashMap;
import java.util.Map;

public class mergeMap {
    public static void main (String []args){

        Map<String,Integer> map = new HashMap<>();
        map.put("navin",12);
        map.put("harsh ",51);
        map.put("sushil",89);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("AB",70);
        map2.put("BG", 100);
        map2.put("JH", 90);

//        map.putAll(map2);
//        System.out.println(map);

    }
}
