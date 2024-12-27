package Map;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class keyGreaterThanGivenNumber {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the given number ");
        int given = sc.nextInt();

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Apple", 50);
        map1.put("Banana", 30);
        map1.put("Orange", 40);
        map1.put("Grapes", 60);

        for (Map.Entry<String, Integer> e : map1.entrySet()) {
            if(e.getValue() > given){
                System.out.println(e.getKey() +" : " + e.getValue());
            }
        }
    }
}
