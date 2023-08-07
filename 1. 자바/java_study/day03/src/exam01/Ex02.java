package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num = 10;

        //boolean result = ++num > 10 || (num = num + 10) > 10; //true , true => num = 11
        boolean result = ++num > 12 || (num = num + 10) > 10; // false , true => num = 21
        System.out.printf("num=%d%n", num); // 자바는 기본적으로 답이 나오면 뒤에 연산은 안함 => num = 11 // 단락회로평가


        int num2 = 10;

        //boolean result2 = ++num2 >  10 && (num2 = num2 + 10) < 30; // true, true => num2 = 21
        boolean result2 = ++num2 <  10 && (num2 = num2 + 10) < 30; // false, true => num2 = 11
        System.out.printf("num2=%d%n", num2);
    }
}
