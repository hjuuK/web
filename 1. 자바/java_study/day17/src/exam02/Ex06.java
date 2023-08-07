package exam02;

import java.text.MessageFormat;

public class Ex06 {
    public static void main(String[] args) {
        String loginMsg = "{0}({1})님 로그인..."; // 회원명, 아이디
        String msg = MessageFormat.format(loginMsg, "사용자01", "user01");
        System.out.println(msg);
    }
}
