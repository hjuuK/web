package restControllers;

import controllers.member.JoinForm;
import lombok.RequiredArgsConstructor;
import models.member.JoinService;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<JoinForm> register(@RequestBody JoinForm form) { // 요청 데이터를 해석해서 넣어줌
        joinService.join(form);

        //return ResponseEntity.status(HttpStatus.CREATED).build(); // build() => 응답 상태만 있고 바디는 없음 // CREATED = 201

        return ResponseEntity.status(HttpStatus.CREATED).body(form); // body() => 응답 할 때 body에 출력됨
    }


}
