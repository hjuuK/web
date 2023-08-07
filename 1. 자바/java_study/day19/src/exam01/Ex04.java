package exam01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex04 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        LocalDateTime today = LocalDateTime.now();
        String strDate = formatter.format(today);

        System.out.println(strDate);
    }
}
