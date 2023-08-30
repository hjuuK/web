package config.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.member.Member;
import org.springframework.web.servlet.HandlerInterceptor;

public class MemberOnlyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("commonData", "공통 데이터!!!");

        HttpSession session = request.getSession();
        Member member = (Member)session.getAttribute("member");
        if (member != null) { // 로그인 상태
            return true;    // true/false로 접근에 대한 통제 가능
        }

        // 미로그인 상태
        response.sendRedirect(request.getContextPath() + "/member/login");

        return false;  // 로그인 하지 않으면 화면이 나오지 않음
    }
}
