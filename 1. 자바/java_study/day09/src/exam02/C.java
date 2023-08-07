package exam02;

public class C extends B {
    int numC = 30;

    public C() {
        super(); // 자동 추가 // 상위 클래스의 기본 생성자 메서드 - B()
        
        System.out.println("C 생성자!");
    }
}
