package exam01;

public class Ex02 {
    public static void main(String[] args) {
       // Schedule2 s1 = new Schedule2(2023, 6, 22);
        Schedule2 s1 = new Schedule2(); // 기본생성자 =>s 오늘 날짜
        s1.showInfo();
        /*
        s1.setYear(2023);
        s1.setMonth(5);
        s1.setDay(22);
         */

        //s1.printThis(); // this -> s1과 동일한 주소값을 가지고 있음
        //System.out.println("s1="+s1);
    }
}
