package restControllers;

import controllers.member.JoinForm;
import lombok.RequiredArgsConstructor;
import models.member.JoinService;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberDao memberDao;
    private final JoinService joinService;

    @GetMapping("/{id}")
    public Member info(@PathVariable("id") String userId) {
        Member member = memberDao.get(userId);

        return member;
    }

    @GetMapping("/list")
    public List<Member> list() {
        List<Member> members = memberDao.getList();

        return members;
    }

    /*
    @GetMapping("/hello")
    public String hello() {
        return "Hello!!";
    }
     */

    @GetMapping("/hello")
    public void hello() {
        System.out.println("Hello!!!!");
    }

    @GetMapping("/register")
    public void register(@RequestBody JoinForm form) { // 요청 body를 해석해서 넣어줌
        System.out.println(form);
    }
}
