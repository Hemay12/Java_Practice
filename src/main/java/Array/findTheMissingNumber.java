package Array;

public class findTheMissingNumber {
    public static void main (String [] args){

        int[] array = {1, 2, 4, 5, 6}; // Missing number is 3
        System.out.println(missingNumber(array));
    }

    static int missingNumber(int[] array) {
        int n = array.length + 1; // Since one number is missing, the length should be n+1
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
}
