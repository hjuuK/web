package exam01;

public class Ex03 {
    public static void main(String[] args) {
        //Calculator  cal = (a, b) -> a + b;
        //int result = calc(cal, 10, 20);
        int result = calc((a, b) -> a * b, 10, 20);
        System.out.println(result);
    }

    public static int calc(Calculator cal, int num1, int num2) {
        return cal.add(num1, num2);
    }
}
