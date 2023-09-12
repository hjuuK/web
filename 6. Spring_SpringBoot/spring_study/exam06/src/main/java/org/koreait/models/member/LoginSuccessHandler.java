package org.koreait.models.member;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {     // Authentication authentication => 로그인 되어있는 회원 정보가 담겨있는 객체
        HttpSession session = request.getSession();

        session.removeAttribute("requiredUserId"); // session 비우기
        session.removeAttribute("requiredUserPw");
        session.removeAttribute("globalError");
        session.removeAttribute("userId");

        /* 로그인 회원 정보 처리 */
        MemberInfo memberInfo = (MemberInfo)authentication.getPrincipal(); // 반환값 -> Object / 로그인 상태에서는 항상 회원 정보가 담겨있음
        session.setAttribute("memberInfo", memberInfo);

        response.sendRedirect(request.getContextPath() + "/");  // 로그인 성공시 페이지 이동
    }
}
