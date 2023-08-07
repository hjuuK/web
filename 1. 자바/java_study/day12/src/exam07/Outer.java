package exam07;

public class Outer { // 인스턴스 자원 사용 불가
    int num1 = 100;
    static int num2 = 200;

    static void outerMethod() {
        System.out.println("외부 클래스 정적 메서드!");
    }
    
    static class Inner { // 정적 내부 클래스
        void method() {
            num2 = 300;
            //Outer.this.num1 = 200; // 인스턴스 자원 사용 불가
            System.out.println("메서드!!!");
            outerMethod();
        }
    }


}
