package exam02;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3}, {4,5,6}};

        //System.out.println(Arrays.toString(nums)); // [[I@723279cf, [I@10f87f48]
        System.out.println(Arrays.deepToString(nums)); // 2차원 배열 이상 값 출력
    }
}
