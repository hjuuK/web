package exam02;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex02 {
    public static void main(String[] args) throws ParseException {
        String strNum = "1,000,000,000";
        String pattern = "#,###";
        DecimalFormat df = new DecimalFormat(pattern);
        Number number = df.parse(strNum);
        long num = number.longValue();

        System.out.println(num);
    }
}
