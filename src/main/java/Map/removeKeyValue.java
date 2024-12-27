package Map;

import java.util.HashMap;
import java.util.Map;

public class removeKeyValue {
    public static void main (String [] args){

        Map<String, Integer> map = new HashMap<>();
        map.put("navin",12);
        map.put("harsh ",51);
        map.put("Kiran", 33);
        map.put(null,32);
//        System.out.println(map);
        System.out.println(map.size());

        if(map.containsKey("navin")){
            map.remove("navin");
        }

        System.out.println(map);
        
    }
}
