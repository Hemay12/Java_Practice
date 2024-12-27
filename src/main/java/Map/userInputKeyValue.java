package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class userInputKeyValue {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you add in HashMap");
        int number = sc.nextInt();

        Map<String,Integer> map = new HashMap<>();

        for(int i =0 ; i<number ; i++){
            System.out.println("Enter the key String " +i );
            String str = sc.next();
            System.out.println("Enter the value Interger" + str);
            int a = sc.nextInt();
            map.put(str,a);
        }

        System.out.println(map);

    }
}
