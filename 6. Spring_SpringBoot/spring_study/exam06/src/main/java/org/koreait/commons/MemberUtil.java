package org.koreait.commons;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.models.member.MemberInfo;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberUtil {
    private final HttpSession session;

    // 회원 정보 조회
    public MemberInfo getMember() {

    }
}
