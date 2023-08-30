package controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MembersController {
    @GetMapping
    public String list() {  // 날짜를 통한 회원목록 조회
        return "member/list";
    }
}
