package exam01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {
    public static void main(String[] args) {
        //Pattern pattern = Pattern.compile("abc"); // "abc"가 포함되어있냐를 체크
        //Pattern pattern = Pattern.compile("[bd]"); // b와 d 중에서 포함된게 하나라도 있나 체크
        //Pattern pattern = Pattern.compile("[a-zA-Z]"); // 알파벳이 포함되어 있는 패턴 (범위 설정)
        //Pattern pattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE); // [a-zA-Z]와 동일 / 대소문자 구분없이 패턴 체크

        //Pattern pattern = Pattern.compile("[0-9]");
        //Pattern pattern = Pattern.compile("\\d"); // \d가 맞지만 자바에서는 \ 하나가 제거되기 때문에 \\d로 써야함 // \d == [0-9]

        //Pattern pattern = Pattern.compile("[^a-zA-Z]"); // 소문자 알파벳을 제외한 패턴 / 아닌 패턴이 하나라도 있으면 제외되지 않음 ex) AB123
        //Pattern pattern = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);

        //Pattern pattern = Pattern.compile("[^0-9]"); // 숫자가 포함된 패턴 제외 == \D
        Pattern pattern = Pattern.compile("\\D");

        String[] strs = { "AB123", "abcd", "bcd", "efg", "1234", "!@#$%^" };
        for (String str : strs) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                System.out.println(str);
            }
        }
    }
}
