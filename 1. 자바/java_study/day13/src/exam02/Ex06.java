package exam02;

public class Ex06 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            //int num2 = 0;
            int num2 = 2;
            int result = num1 / num2; // ArithmeticException

            String str = null;
            str.toUpperCase(); // NullPointerException
        } catch (ArithmeticException | NullPointerException e) { // 다중 예외 처리
            System.out.println(e.getMessage());
        }
    }
}
