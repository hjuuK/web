package models.member;

import jakarta.servlet.http.HttpServletRequest;

public class LoginService {

    private LoginValidator validator;
    private MemberDao memberDao;

    public LoginService(MemberDao memberDao, LoginValidator validator) {
        this.memberDao = memberDao;
        this.validator = validator;
    }

    public void login(HttpServletRequest request) {
        validator.check(request);

        /* 로그인 처리 */
        String userId = request.getParameter("userId");
        Member member = memberDao.get(userId);
    }
}