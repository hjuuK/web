package org.koreait.controllers.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.commons.MemberUtil;
import org.koreait.entities.BoardData;
import org.koreait.models.member.MemberInfo;
import org.koreait.repositories.BoardDataRepository;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Slf4j  // extern
@Controller
@RequestMapping("/mypage")
@RequiredArgsConstructor
public class MypageController {
    private final MemberUtil memberUtil;
    private final BoardDataRepository repository;

    @GetMapping
    @ResponseBody
    public void index() {   // private final MemberUtil memberUtil; // 별도의 편의 클래스를 이용해서 회원 정보 가져오기
        BoardData data = repository.findById(2L).orElse(null);
        data.setSubject("(수정)제목1");
        repository.flush();

        /*
        BoardData data = BoardData.builder()
                .subject("제목1")
                .content("내용1")
                .build();

        repository.saveAndFlush(data);
         */

        /*
        log.info("로그인 여부 : " + memberUtil.isLogin());
        if (memberUtil.isLogin()) { // 로그인상태일때만 회원정보 가져와서 출력
            MemberInfo member = memberUtil.getMember(); // 회원 정보 가져오기
            log.info(member.toString());
        }
         */
    }
    /*
    public void index() {
        MemberInfo member = (MemberInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        log.info(member.toString());
    }
     */

    /*
    public void index(@AuthenticationPrincipal MemberInfo member) {
        log.info(member.toString());
    }
     */

    /*
    public void index(Principal principal) {  // Principal -> 현재 로그인한 사용자 아이디 확인 가능
        String userId = principal.getName();
        log.info(userId);
    }
     */
}
