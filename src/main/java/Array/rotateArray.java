package Array;

public class rotateArray {
    public static void main (String [] args){
        int [] nums = {1,2,3,4,5,6,7};
        for(int a1: nums){
            System.out.print(a1);
        }
        System.out.println("\n");
        int k =3;
        rotateA(nums, k);
//        System.out.println(3%7);
    }

    private static void rotateA(int[] nums, int k) {

        int [] arr = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            int j = (i+k) % nums.length;
            arr[j] =nums[i];
        }
        for(int i = 0; i<nums.length;i++){
            nums[i] = arr[i];
            System.out.print(nums[i]);
        }
    }
}
