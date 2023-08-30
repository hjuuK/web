package controllers.member;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/members")
public class MembersController {
    @GetMapping
    public String list(@ModelAttribute @Valid SearchForm form, Errors errors) {  // 날짜를 통한 회원목록 조회

        return "member/list";
    }

    @GetMapping("/info/{userId}")
    public String info(@PathVariable("id") String userId) {
        System.out.println("userId : " + userId);

        boolean result = false;
        if (!result) {
            throw new RuntimeException("예외 발생...!!!");
        }

        return "member/info";
    }

    @ExceptionHandler(RuntimeException.class)
    public String errorHandler() {
        return "error/common";
    }
}
