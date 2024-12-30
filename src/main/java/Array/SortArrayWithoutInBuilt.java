package Array;

public class SortArrayWithoutInBuilt {
    public static void main(String [] args){

        int [] arr = {12,4,54,3,34,5};

        sortArray(arr);
    }

    static void sortArray(int [] a){
        int min=Integer.MAX_VALUE;
        for(int i=0 ; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int ap : a){
            System.out.print("\t"+ap);
        }

    }
}
