package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Calculator  cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        calc(cal, 10, 20);
    }

    public static int calc(Calculator cal, int num1, int num2) {
        return cal.add(num1, num2);
    }
}
