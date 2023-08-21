package exam06.models.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListService {
    private final MemberDao memberDao; // 알아서 생성자 매개변수 주입


    public void print() {
        List<Member> members = memberDao.getList();
        members.stream().forEach(System.out::println);
    }
}