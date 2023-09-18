package exam01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex06 {
    public static void main(String[] args) {
        String html = "<img src='/front/images/test.png' alt='이미지 설명'>";
        String pattern = "<img.*src='['\"]?([^'\">]*)['\"]?[^>]*>";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(html);
        if (matcher.find()) {
            String src = matcher.group(1); // 서브 패턴의 순서
            System.out.println(src);
        }
    }
}
