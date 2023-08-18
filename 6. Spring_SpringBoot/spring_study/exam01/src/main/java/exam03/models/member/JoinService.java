package exam03.models.member;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class JoinService {
//    @Autowired
//    private MemberDao memberDao;
    @Autowired
    private Optional<MemberDao> opt;

    @Autowired
    private JoinValidator validator;

    public JoinService() {} // 기본 생성자 추가

    public JoinService(MemberDao memberDao, JoinValidator validator) {
        //this.memberDao = memberDao;

        this.validator = validator;
    }

    public void join(Member member) {
        MemberDao memberDao = opt.get();

        validator.check(member);

        memberDao.register(member);
    }
}
