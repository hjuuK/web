package exam01;

public class Ex08 {
    public static void main(String[] args) {
        int num1 = 30;
        Calculator cal = (a, b) -> {
            //num1 = 40; // 상수화되기 때문에 변경 불가 // final int num1
            return a + b + num1;
        };
    }
}
