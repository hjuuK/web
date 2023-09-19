package models.member;

import commons.BadRequestException;
import commons.RequiredValidator;

public class JoinService implements RequiredValidator {
    // 확장된 열린 구조, 통제를 위해 생성자 매개 변수로 주입 (의존성)
    private MemberDao memberDao;

    public JoinService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void join(Member member) {
        requiredCheck(member.getUserId(), new BadRequestException("아이디를 입력하세요."));
        requiredCheck(member.getUserPw(), new BadRequestException("비밀번호를 입력하세요."));
        requiredCheck(member.getUserNm(), new BadRequestException("회원명을 입력하세요."));

        if (memberDao.exists(member.getUserId())) {
            throw new DuplicateUserIdException();
        }

        memberDao.add(member);
    }
}
