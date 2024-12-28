package top20mostAsked;

public class elementStartDecrease {
    public static void main (String [] args){

        int [] arr = {1,2,3,2,1};
        int a =0;
        for(int i =0; i<arr.length -1; i++){
            if(arr[i] > arr[i+1]){
                a =arr[i];
                break;
            }
        }
        System.out.println(a);
    }
}
