package models.member;

import controllers.member.JoinForm;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {
    private final MemberDao memberDao;

    public void join(JoinForm joinForm) {
//        Member member = Member.builder()
//                .userId(joinForm.getUserId())
//                .userPw(joinForm.getUserPw())
//                .userNm(joinForm.getUserNm())
//                .build();

        String userId = joinForm.getUserId();
        if (memberDao.exists(userId)) {
            throw new DuplicateMemberException(); // 중복된 표현일 때 "이미 등록된 회원입니다."
        }

        Member member = new ModelMapper().map(joinForm, Member.class);  // ModelMapper -> getter,setter 호출

        memberDao.register(member);

    }
}
