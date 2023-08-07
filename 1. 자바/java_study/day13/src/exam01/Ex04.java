package exam01;

public class Ex04 {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void method() { // 메서드 재정의
                System.out.println("변경된 method()");
            }
        };

        a.method();
    }
}
