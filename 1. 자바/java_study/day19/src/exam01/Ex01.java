package exam01;

import java.time.LocalDate;
import java.time.Period;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        //LocalDate date2 = date1.minusDays(100);
        LocalDate date2 = date1.plusDays(100);
        Period period = Period.between(date1, date2); // 날짜 사이 간격

        //System.out.println(period);

        int month = period.getMonths();
        int day = period.getDays();
        System.out.printf("month=%d, day=%d%n", month, day);

        Period period2 = Period.of(2, 2, 10);
        System.out.println(period2);

        Period period3 = Period.ofDays(100);
        System.out.println(period3);
    }
}
