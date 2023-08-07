package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(22,33,44,55,66);
        List<Integer> nums1 = Arrays.asList(1,2,3,4,5);
        //Collections.copy(nums, nums1);

        //System.out.println(nums);

        boolean result = Collections.disjoint(nums, nums1); // 공통점이 없으면 true
        System.out.println(result);

        List<String> alphas = Arrays.asList("A","A","A","B","C");
        int cnt = Collections.frequency(alphas, "A");
        System.out.println(cnt);
    }
}
