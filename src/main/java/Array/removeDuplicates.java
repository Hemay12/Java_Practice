package Array;

import java.util.HashSet;

public class removeDuplicates {
    public static void main (String [] args){

        int [] arr = {1,1,2};

        removeDuplicatesMethod(arr);
        System.out.println(removeDuplicatesLeetCode(arr));
    }

    private static void removeDuplicatesMethod(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        System.out.println(set);

    }

    static int removeDuplicatesLeetCode(int[] nums) {
        int i=0;
        for(int j=1; j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
