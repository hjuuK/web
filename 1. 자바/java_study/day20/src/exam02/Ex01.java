package exam02;

import java.util.HashSet;

public class Ex01 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름2"); // 이름2 중복
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");
        // toString() 재정의 되어 있음 // 안에 값들을 확인할 수 있는 내용들이 담겨있다.

        System.out.println(names); // 순서 유지 X, 중복 X
    }
}
