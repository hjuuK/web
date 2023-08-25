package controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member/join")  // 공통적인 주소
public class MemberJoinController {
    @GetMapping  // /member/join
    //@RequestMapping(method=RequestMethod.GET, path="/member/join")
    public String join() {
        return "member/join";
    }

    @PostMapping
    public String joinPs(JoinForm form, Model model) { // 커맨드 객체 // joinForm -> joinForm : EL 속성 추가
        //model.addAttribute("joinForm", joinForm); // join.sjp => EL식으로 데이터 사용 -> 주입
        System.out.println(form);
        return "member/join2";
    }

    /*
    @PostMapping  // /member/join
    public String joinPs(@RequestParam(name="userId", required=false, defaultValue="없는 아이디") String memId, String userPw, boolean agree) {
        System.out.printf("userId=%s, userPw=%s, agree=%s%n", memId, userPw, agree);
        return null;
    }
     */
}
