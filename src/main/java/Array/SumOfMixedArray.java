package Array;

public class SumOfMixedArray {
    public static void main(String [] args){
        String[] arr = {"5", "2", "9", "a", "1", "6", "#", "3"};
        int sum = sumIntegers(arr);
        System.out.println(sum);
        int sum1 = sumIntegersGPT(arr);
        System.out.println(sum1);
        int sum2 = sumIntegersSidBest(arr);
        System.out.println(sum2);

    }

    private static int sumIntegersSidBest(String[] arr) {
        int max=0;
        for(String str : arr){
            try {
                int i = Integer.parseInt(str);
                max+=i;
            }catch (NumberFormatException e){}
        }

        return max;
    }

    private static int sumIntegersGPT(String[] arr) {
        int max=0;
        for (String str : arr) {
            if (str.matches(".*\\d.*")) { // Check if the string contains any digit
                int i = Integer.parseInt(str);
                max += i;
            }
        }
        return max;
    }

    private static int sumIntegers(String[] arr) {
        int max=0;
        for(String str : arr){
            if(str.contains("2") || str.contains("1") || str.contains("3") || str.contains("4") ||
                    str.contains("5") || str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9")){
                int i =Integer.parseInt(str);
                max+=i;
            }
        }
        return max;
    }
}
