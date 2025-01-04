package Array;

public class StockProfit {

    public static void main(String [] args){
        int [] prices = {7,1,5,3,6,4};

//    Input: prices = [7,1,5,3,6,4]
//    Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

        profit(prices);
    }

    static void profit(int arr[]) {

        int diff_max=0;
        int minElement=arr[0];

        for(int i=0; i<arr.length-1;i++){
            int diff =  arr[i] - minElement;
            if(diff> diff_max){
                diff_max = diff;
            }
            if(arr[i]<minElement){
                minElement = arr[i];
            }
        }

        System.out.println(diff_max);
    }
}

