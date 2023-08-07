package exam03;

public class Ex03 {
    public static void main(String[] args) {
        //C c = new C();
        //A a = c; ↓
        A a = new C();

        //B b = c; ↓
        B b = new C();

        B bb = (B)a;  // 작은 범위에서 큰 범위로 올리기 때문에 명시적(자료형) 필요

        System.out.println(a instanceof C);
        System.out.println(a instanceof B);
        System.out.println(a instanceof A); // instanceof가 꼭 하위클래스만이 아니라 소속되어있는 모든 클래스를 검사 가능
    }
}
