package org.koreait.controllers.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Slf4j  // extern
@Controller
@RequestMapping("/mypage")
public class MypageController {
    @GetMapping
    @ResponseBody
    public void index(Principal principal) {  // Principal -> 현재 로그인한 사용자 아이디 확인 가능
        String userId = principal.getName();
        log.info(userId);
    }
}
