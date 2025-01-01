package Array;

public class LargestAndSmallestElement {
    public static void main (String [] args){

        int[] array = {1, 33, 4, 5, 6};
        System.out.println(LargestAndSmallest(array));

    }

    static String LargestAndSmallest(int[] array) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max= array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }

        return max + " "+ min;
    }
}
