package org.koreait.commons;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.models.member.MemberInfo;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberUtil {
    private final HttpSession session;

    // 현재 로그인 상태인지 체크
    public boolean isLogin() {
        return getMember() != null;
    }

    // 회원 정보 조회
    public MemberInfo getMember() {
        MemberInfo member = (MemberInfo)session.getAttribute("memberInfo");

        return member;
    }
}
