package exam01;

public class Ex01 {
    public static void main(String[] args) {
        //Outer outer = new Outer();
        //outer.method();

        Outer2 outer = new Outer2();
        //outer.method();
        Calculator cal = outer.method(30); // num3 - 지역변수 -> 반환 후 제거
        int result = cal.add(10,20); // 10+20+30
        System.out.println(result);
    }
}
