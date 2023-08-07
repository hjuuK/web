package exam02;

public abstract class Calculator {
    int num = 10;

    public abstract int add(int num1, int num2); // 추상 메서드

    public int minus(int num1, int num2) { // 공통적인 자원
        return num1-num2;
    }
}
