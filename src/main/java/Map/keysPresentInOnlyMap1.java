package Map;

import java.util.HashMap;
import java.util.Map;

public class keysPresentInOnlyMap1 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 50);
        map1.put("Banana", 30);
        map1.put("Orange", 40);
        map1.put("Grapes", 60);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 50);
        map2.put("Banana", 30);
        map2.put("Pineapple", 20);
        map2.put("Mango", 15);

        HashMap<String, Integer> map3 = new HashMap<>();

        for (Map.Entry<String, Integer> e : map1.entrySet()) {
            if(!map2.containsKey(e.getKey())){
                map3.put(e.getKey(),e.getValue());
            }
        }
        System.out.println(map3.keySet());
    }
}
