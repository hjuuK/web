package exam01;

public class Ex07 {
    public static void main(String[] args) {
        Calculator cal = getCalculator();
        cal.add(10, 20);
    }

    public static Calculator getCalculator() {
        //Calculator cal = (a, b) -> a + b;
        //return cal;
        return (a, b) -> a + b;
    }
}
