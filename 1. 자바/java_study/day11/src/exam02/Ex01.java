package exam02;

public class Ex01 {
    public static void main(String[] args) {
        //Calculator cal = new Calculator();
        //int result = cal.add(10,20);
        //System.out.println(result);

        //SimpleCalculator cal = new SimpleCalculator();
        Calculator cal = new SimpleCalculator(); // 다형성
        int result = cal.add(10,20);
        System.out.println(result);

        System.out.println(cal.num); //Calculator - int num   =>  객체가 생성되어 있음(내부적)

    }
}
