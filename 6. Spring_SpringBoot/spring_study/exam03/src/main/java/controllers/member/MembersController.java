package controllers.member;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MembersController {
    @GetMapping
    public String list(@ModelAttribute @Valid SearchForm form, Errors errors) {  // 날짜를 통한 회원목록 조회

        return "member/list";
    }

    @GetMapping("/info/{userId}")
    public String info(@PathVariable String userId) {
        System.out.println("userId : " + userId);

        return "member/info";
    }
}
