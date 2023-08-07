package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름3", "이름2", "이름1", "이름4", "이름5");

        String max = Collections.max(names); // 가장 뒤쪽에 정렬된 내용
        System.out.println(max);

        //String min = Collections.min(names); // 가장 앞쪽에 정렬된 내용
        //String min = Collections.min(names, Comparator.reverseOrder()); // min -> max
        String min = Collections.min(names, Collections.reverseOrder()); // 위와 기능은 같음
        System.out.println(min);
    }
}
