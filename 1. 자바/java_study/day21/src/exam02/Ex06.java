package exam02;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        Arrays.fill(nums, 1); // 배열의 값을 채울때 사용

        System.out.println(Arrays.toString(nums)); // .toString() : 배열의 값 확인


        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,4,5,6};
        int index = Arrays.mismatch(nums1, nums2);
        System.out.println(index); // mismatch 되는 순간 반환 // mismatch 되는 순간이 없으면 -1 반환
    }
}
