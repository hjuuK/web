package exam02;

public class Ex07 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            //int num2 = 0;
            int num2 = 2;
            int result = num1 / num2; // ArithmeticException

            String str = null;
            str.toUpperCase(); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

            // RuntimeException = new NullPointerException()
            // Exception e = new NullPointerException()     // 다형성 이용
        } catch (RuntimeException e) {  // 발생할 예외가 명확하게 잘 모르는 경우 -> 다형성 // => catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
