package exam02;

public class Outer {
    int num1 = 10;
    static int num2 = 10;
    static class Inner { // static이 붙으면 정적 내부 클래스 / 외부 클래스인 Outer와 상관없이 호출 가능
        public void method() {
            System.out.println("정적 내부 클래스!");
            //System.out.println(num1); // 접근 불가 // 정적인 자원만 접근 가능
            System.out.println(num2); // 접근 가능 // 정적 자원 접근 가능
        }
    }
}
