package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class removeGivenKey {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key you want to remove ");
        String str = sc.next();

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 50);
        map1.put("Banana", 30);
        map1.put("Orange", 40);
        map1.put("Grapes", 60);

        if (map1.containsKey(str)) {
            map1.remove(str);
        }
        System.out.println(map1);
    }
}



