package Map;

import java.util.HashMap;
import java.util.Map;

public class copyMap {
    public static void main (String [] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("navin",12);
        map.put("harsh ",51);
        map.put("Kiran", 33);

        Map<String, Integer> copyMap = new HashMap<>();
        copyMap.putAll(map);
//        System.out.println(copyMap);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("AB",70);
        map2.put("BG", 100);
        map2.put("JH", 90);
        map2.put("Kiran", 99);

        map2.putAll(map);
        System.out.println(map2);

//        map.putAll(map2);
//        System.out.println(map);
    }
}
