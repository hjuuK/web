package exam03.sub;

import exam03.A;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        //a.num1; 접근 불가 // 하위 패키지도 다른 패키지이기 때문에 defalt 접근 불가
        B b = new B();
        b.num2=10; //public만 보임
    }
}
