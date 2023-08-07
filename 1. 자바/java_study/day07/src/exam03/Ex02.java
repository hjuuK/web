package exam03;

public class Ex02 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.num1);
        //a.num3; // private는 같은 패키지여도 다른 클래스면 접근 불가
    }
}
