package String;

import java.util.Scanner;
import java.util.regex.Pattern;

//Time taking because of handling of too many cases. complexity is low to moderate.

public class validate_IPV4_address {
    public static void main (String [] args){

        System.out.println("Enter the IPV4 address");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean isMatch = true;
        String regex = "[a-zA-Z\\W&&[^0-9.]]";
        if (Pattern.compile(regex).matcher(str).find()) {
            isMatch = false;
            System.out.print("Your entered address is incorrect.");
            System.out.println("IPV4 address contains only digit and .");
        }
        else {
            System.out.println("Heelo");
        }
    }
}
