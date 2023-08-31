package models.member;

import controllers.member.JoinForm;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@RequiredArgsConstructor
public class JoinService {
    private final MemberDao memberDao;

    public void join(JoinForm joinForm) {
        Member member = new ModelMapper().map(joinForm, Member.class);

        memberDao.register(member);

    }
}
