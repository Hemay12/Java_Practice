package String;

import java.util.Arrays;
import java.util.Scanner;

public class secondHighestFrequency {
    public static void main (String [] args){

        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);

        boolean[] visited = new boolean[256]; //visited = [false, false, ..., false]; // All 256 elements are false

        for(int i= 0; i<arr.length ; i++){
            int count =0;

            if (visited[arr[i]]) {
                continue;
            }

            visited[arr[i]] = true;

            for(int j=0 ; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            System.out.println(arr[i] + " count is " + count);
        }
    }
}

//First Iteration (i = 0, ch = 'p'):
//visited['p'] is false.
//Count occurrences of 'p'.
//Mark 'p' as visited: visited['p'] = true.

//Second Iteration (i = 1, ch = 'r'):
//visited['r'] is false.
//Count occurrences of 'r'.
//Mark 'r' as visited: visited['r'] = true.

//Third Iteration (i = 2, ch = 'o'):
//visited['o'] is false.
//Count occurrences of 'o'.
//Mark 'o' as visited: visited['o'] = true.

//Repeated Character (i = 9, ch = 'r'):
//visited['r'] is true.
//Skip the iteration (continue)
