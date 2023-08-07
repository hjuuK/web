package exam01;

public class Ex03 {
    public static void main(String[] args) {
        long num1 = 10000000000L; // int로 먼저 인식 -> long으로 바꿈
        long num4 = 1_000_000_000L; // _로 구분해도 인식
        byte num2 = 10; // int -> byte
        short num3 = 1000; // int -> short

        float num5 = 10.123F;
        double num6 = 10.123;
    }
}
