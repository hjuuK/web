package exam02;

public class Q1 {
    public static void main(String[] args) {
        //변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오

        int i=20;
        double j=3.0;

        System.out.printf("%d + %.1f = %d%n", i, j, (int)(i+j)); //(int)i*(int)j 는 오답
        System.out.printf("%d - %.1f = %d%n", i, j, (int)(i-j));
        System.out.printf("%d * %.1f = %d%n", i, j, (int)(i*j));
        System.out.printf("%d ÷ %.1f = %d%n", i, j, (int)(i/j));
    }
}
