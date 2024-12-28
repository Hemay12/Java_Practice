package top20mostAsked;

public class secondSmallestElementInArray {
    public static void main (String []args){

        int [] arr = {23,2,3,45,4,3,35,6,3,5,6};
        printsecondSmallestElementInArray(arr);
    }

    static void printsecondSmallestElementInArray(int[] arr) {
        int smallest =Integer.MAX_VALUE;
        int secondSmallest =Integer.MAX_VALUE;

        for(int i=0; i<arr.length;i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }

            else if(secondSmallest>arr[i]){
                secondSmallest = arr[i];
            }
        }
        System.out.println(smallest + " " + secondSmallest);
    }
}
