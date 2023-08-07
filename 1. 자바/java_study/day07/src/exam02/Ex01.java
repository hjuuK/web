package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        
        // 멤버변수에 값을 대입 -> 통제 불가 -> 직접 값을 대입을 지양
        // 멤버변수의 접근 범위 private
        // 멤버변수를 메서드를 통해서 값을 지정 set  => 캡슐화
        // 멤버변수를 메서드를 통해서 값을 조회 get...
        /*
        s1.year = 2023;
        s1.month = 5;
        s1.day = 19;
         */

        s1.setYear(2023);
        s1.setMonth(2);
        s1.setDay(31);

        int month = s1.getMonth();
        System.out.println(month);

        s1.showDate();
    }
}
