package exam02;

public class Ex03 {
    public static void main(String[] args) {
        D d = new D(); // D() -> A()
        A ad = d;

        //C c2 = ad; // 오류발생↓
        //C c2 = (C)ad; // 자료형 명시 => 오류 발생 // D라고 하는 객체는 C 객체로 바뀔 수 없다.↓ instanceof로 자료형 확인
        if (ad instanceof C) {
            C c2 = (C) ad;
        }

        C c = new C();
        A ac = c;

    }
}
