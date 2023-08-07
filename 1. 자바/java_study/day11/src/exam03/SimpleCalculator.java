package exam03;

public class SimpleCalculator implements Calculator {
    public int add(int num1, int num2) { // interface에서 상속 추상 메서드는 public만 사용 가능
        return num1+num2;
    }
}
