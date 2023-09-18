package exam01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {
    public static void main(String[] args) {
        String[] str = { "AAA", "BAAC", "AB", "ABC" };
        Pattern pattern = Pattern.compile("[A]{2}"); // 패턴{숫자} -> 패턴이 숫자만큼 반복되는지 체크
        for (String s : str) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                System.out.println(s);
            }
        }
    }
}
