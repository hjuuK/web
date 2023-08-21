package exam04.models.member.sub;

import org.springframework.stereotype.Repository;

@Repository("memberDao2")
public class MemberDao { // 이름이 같으면 다른 클래스더라도 충돌 발생 => value 값으로 이름을 명시하면 충돌 발생 X

}
