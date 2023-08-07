package exam03;

public interface Calculator { // 추상메서드만 정의 => 설계목적으로 나온 클래스이기 때문 (구현이 안됨)
    int NUM = 10; // public static final num = 10  -> 정적 상수 *상수는 대문자로 쓰는게 관례

    int add(int num1, int num2);  // public abstract // public만 가능
    
    /*
    int add(int num1, int num2) {
        return num1+num2;
    }   => 오류발생 (구현 불가), 추상메서드만 가능
     */

    default int minus(int num1, int num2) { // 완전히 구현된 메서드를 정의하기 위해서는 default 키워드를 사용해야 함
        privateMethod();
        //num = 20;
        int result = num1-num2;
        return result;
    }

    public static void staticMethod() { // 객체를 생성할 필요가 없기 때문에 가능
        System.out.println("정적 메서드 호출!"); 
    }

    private void privateMethod() {
        System.out.println("Private Method!");
    }
}
