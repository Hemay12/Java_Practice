package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class createHashMap {
    public static void main (String [] args){

        Map<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st element in map ");
        int x =sc.nextInt();
        map.put(x,x*x );

        System.out.println("Enter the 2nd element in map  ");
        int x1 =sc.nextInt();
        map.put(x1,x1*x1 );

        System.out.println("Enter the 2nd element in map  ");
        int x2 =sc.nextInt();
        map.put(x2,x2*x2 );

        System.out.println(map);
    }
}
