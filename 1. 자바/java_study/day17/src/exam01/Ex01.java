package exam01;

import java.util.Objects;

public class Ex01 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5 };
        int[] nums2 = { 1, 2, 3, 4, 5 };

        boolean matched = Objects.deepEquals(nums1, nums2);
        System.out.println(matched);
    }
}
