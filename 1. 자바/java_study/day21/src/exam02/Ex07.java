package exam02;

import java.util.Arrays;
import java.util.Comparator;

public class Ex07 {
    public static void main(String[] args) {
        Integer[] nums = {11, 2, 5, 22, 33, 6};
        //Arrays.sort(nums); // 오름차순
        Arrays.sort(nums, Comparator.reverseOrder()); // 내림차순
        System.out.println(Arrays.toString(nums));
    }
}
