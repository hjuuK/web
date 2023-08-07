package exam01;

public class SimpleCalculator implements Calculator {
    public int add(int num1, int num2) { //default불가, public만 가능
        return num1+num2;
    }
}
