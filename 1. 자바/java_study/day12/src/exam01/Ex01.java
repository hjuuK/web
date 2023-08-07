package exam01;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println(Calculator.num); // 정적 상수

        //Calculator cal = new SimpleCalculator(); // 다형성

        Calculator cal = getCalculator(); // SimpleCalculator, ComplexCalculator
        // Calculator cla = new SimpleCalculator();

        //SimpleCalculator cal = new SimpleCalculator();
        //ComplexCalculator cal = new ComplexCalculator();
        int result = cal.add(10,20);
        System.out.println(result);
    }
    
    private static Calculator getCalculator() { // 다형성 활용
        //return new SimpleCalculator();
        return new ComplexCalculator();
    }
}
