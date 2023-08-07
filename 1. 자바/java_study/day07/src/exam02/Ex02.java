package exam02;

import exam03.A;

public class Ex02 {
    public static void main(String[] args) {
        A a = new A();
        // a.num1 접근 불가  //defalt는 다른 패키지에서 접근 불가(동일한 패키지만 접근 가능)
        a.num2=10; //public 접근 다른 패키지 접근 가능
    }
}
