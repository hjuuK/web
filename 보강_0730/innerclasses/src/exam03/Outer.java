package exam03;

public class Outer {
    public void method() {
        class Inner {
            public void method() {
                System.out.println("지역 내부 클래스!");
            }
        }

        Inner in = new Inner();
        in.method();
    }
}
