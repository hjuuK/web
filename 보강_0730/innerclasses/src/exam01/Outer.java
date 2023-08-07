package exam01;

public class Outer {
    int num1 = 30;
    class Inner { // 인스턴스 내부 클래스
        static int num = 10; // JDK15 까지는 정적 자원은 정의 X / JDK16 버전 이후부터는 가능
        int num1 = 20; // 얘가 없으면 상위 클래스의 num1이 출력
        
        public void method() {
            System.out.println("인스턴스 내부 클래스에서 호출된 메서드!, num1 = " + num1);
            System.out.println("Outer.num1 : " + Outer.this.num1);
        }
    }
}
