package exam01;

public interface Calculator { // 추상메서드만 정의
    int num = 10; // 정적 상수
    // public static final num = 10;
    int add(int num1, int num2); // public abstract
    // public int add(int num1, int num2);

    default void commonMethod() { // 인터페이스에서 구현체를 사용하려면 default 사용 (추가된 기능)
        System.out.println("공통기능!");
    }
}
