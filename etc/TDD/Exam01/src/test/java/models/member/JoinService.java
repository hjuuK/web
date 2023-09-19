package models.member;

import commons.BadRequestException;
import commons.RequiredValidator;

public class JoinService {
    // 확장된 열린 구조, 통제를 위해 생성자 매개 변수로 주입 (의존성)
    private MemberDao memberDao;

    private JoinValidator validator;

    public JoinService(MemberDao memberDao, JoinValidator validator) {
        this.memberDao = memberDao;
        this.validator = validator;
    }

    public void join(Member member) {
        validator.check(member);

        if (memberDao.exists(member.getUserId())) {
            throw new DuplicateUserIdException();
        }

        memberDao.add(member);
    }
}
