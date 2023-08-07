package exam01;

public class Ex02 {
    public static void main(String[] args) {
        // 1. main 메서드 지역
        Calculator cal = new Calculator() {
            public int add(int num1, int num2){ // 2. 미구현된 메서드를 구현
                return num1+num2;
            }
        };

        int result = cal.add(10,20);
        System.out.println(result);
    }
}
