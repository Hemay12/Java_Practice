package top20mostAsked;

public class sumUntilSingleDigit {
    public static void main (String [] args){

        int n = 2343;
        System.out.println(printsumUntilSingleDigit(n));
    }

    static int printsumUntilSingleDigit(int n) {
        int sum = 0;
        // Loop to do sum while sum is not less than or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
