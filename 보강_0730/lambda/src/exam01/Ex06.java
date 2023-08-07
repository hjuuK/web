package exam01;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums = { 0,1,2,3,4,5,6,7,8,9 };
        int[] nums2 = Arrays.stream(nums).map(x -> x * x).toArray();
    }
}
