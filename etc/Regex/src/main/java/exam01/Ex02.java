package exam01;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        String fruits = "Apple  Melon Mango   Banana";
        String[] fruits2 = fruits.split("\\s+");    // 한개 이상이 패턴에 포함됨 / \s : 모든 공백 문자 한 개 / + : 앞의 패턴을 1번 이상 반복
        System.out.println(Arrays.toString(fruits2));
    }
}
