package exam03;

import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {
        Date date = new Date();
        int year = date.getYear();
        int month = date.getMonth(); // 0~11
        int day = date.getDate();

        int hour = date.getHours();
        int minute = date.getMinutes();
        int sec = date.getSeconds();
        System.out.printf("%d-%d-%d %d:%d:%d%n", year, month+1, day, hour, minute, sec);
    }
}
