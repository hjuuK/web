package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Calculator cal = (a, b) -> a + b;
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
