package exam02;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,3,4};
        boolean isSame = Arrays.equals(nums1, nums2);
        System.out.println(isSame);



        int[][] nums3 = {{1,2}, {3,4}};
        int[][] nums4 = {{1,2}, {3,4}};
        boolean isSame2 = Arrays.deepEquals(nums3, nums4); // deepEquals() : 2차원배열 이상 비교
        System.out.println(isSame2);
    }
}
