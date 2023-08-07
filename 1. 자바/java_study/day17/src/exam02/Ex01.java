package exam02;

import java.text.DecimalFormat;

public class Ex01 {
    public static void main(String[] args) {
        double num = 100000000000.123;
        //String pattern = "0,000.000000"; // 형식 // 없는 자리수는 0으로 채워넣는다.
        String pattern = "#,###.######";  // 없는 자리수는 채워 넣지 않는다.
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String strNum = decimalFormat.format(num);
        System.out.println(strNum);

    }
}
