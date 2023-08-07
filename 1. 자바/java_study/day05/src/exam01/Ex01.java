package exam01;

public class Ex01 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40};
        /*
        for(int i=00; i<nums.length; i++) {
            System.out.println(nums[i]);
        */

        for(int num : nums) {
            System.out.println(num);
        }
    }
}
