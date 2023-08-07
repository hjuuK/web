package exam02;

public class Ex02 {
    public static void main(String[] args) {
        C c = new C();
        A a = c; // numA 만 사용가능  // A 객체의 내용의 C 객체의 자원 -> 양만 A 클래스정의 범위로 한정
        B b = c; // numA, numB 사용 가능    => 다형성 (다양한 형태로 바뀜(상위클래스))
        // C 객체가 포함하고 있는 B, A 객체로 자료형이 변경 -> 다형성
        
    }
}
