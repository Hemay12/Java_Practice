package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class removeNullValueEntry {
    public static void main (String [] args){

        Map<String,Integer> map = new HashMap();

        map.put("navin",null);
        map.put("harsh ",51);
        map.put("Kiran", 33);
        map.put(null,32);

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            if(entry.getValue() == null){
                iterator.remove();
            }
        }
        System.out.println(map);

    }
}
