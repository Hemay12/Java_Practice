package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class elementPresentOrNot {
    public static void main(String [] args){

        Map<String,Integer> map = new HashMap<>();
        map.put("navin",12);
        map.put("harsh ",51);
        map.put("sushil",89);
        map.put("Kiran",74);

        if(map.containsKey("Kiran")){
            System.out.println(map.get("Kiran"));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to find the key " );
        int a = sc.nextInt();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == a){
                System.out.print(entry.getKey());
            }
        }


    }
}
