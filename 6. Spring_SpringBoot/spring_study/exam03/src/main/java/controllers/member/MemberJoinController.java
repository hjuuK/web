package controllers.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.val;
import models.member.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/member/join")  // 공통적인 주소
@RequiredArgsConstructor
public class MemberJoinController {

    private final JoinValidator joinValidator;
    private final JoinService joinService;

    @GetMapping  // /member/join
    //@RequestMapping(method=RequestMethod.GET, path="/member/join")
    public String join(@ModelAttribute JoinForm joinForm/* 비어있는 객체를 생성해서 EL식 변수로 추가 / EL식 속성으로 추가 */, Model model) {
        //model.addAttribute("joinForm", new JoinForm()); // springform 사용 -> GET방식에 이걸 넣어야만 오류가 없음 (???) = 15행의 @ModelAttribute JoinForm joinForm 과 같음

        //List<String> hobbies = getHobbies();
//        List<Item> hobbies = getHobbies();
//        model.addAttribute("hobbies", hobbies);
//
//        List<Item> types = getMemberTypes();
//        model.addAttribute("types", types);

        //commonProcess(model);

        String[] addCss = {"member/join1", "member/join2"};
        List<String> addScript = Arrays.asList("member/joinjs1", "member/joinjs2");
        model.addAttribute("addCss", addCss);
        model.addAttribute("addScript", addScript);

        model.addAttribute("pageTitle", "회원가입");

        return "member/join";
    }

    @PostMapping
    public String joinPs(/*@ModelAttribute("command") */ @Valid JoinForm form, Errors errors, Model model) { // 커맨드 객체 // joinForm -> joinForm : EL 속성 추가
        //model.addAttribute("joinForm", joinForm); // join.sjp => EL식으로 데이터 사용 -> 주입
        //System.out.println(form);

        //List<String> hobbies = getHobbies();
//        List<Item> hobbies = getHobbies();
//        model.addAttribute("hobbies", hobbies);
//
//        List<Item> types = getMemberTypes();
//        model.addAttribute("types", types);   => commonProcess로 옮김

        //commonProcess(model);
        joinValidator.validate(form, errors);

        if (errors.hasErrors()) { // reject, rejectValue -> true
            return "member/join";
        }

        joinService.join(form);

        return "redirect:/member/login"; // redirect:/ 키워드만 입력
    }

    private void commonProcess(Model model) {
        List<Item> hobbies = getHobbies();
        model.addAttribute("hobbies", hobbies);

        List<Item> types = getMemberTypes();
        model.addAttribute("types", types);
    }

    private List<Item> getMemberTypes() { // 회원종류
        List<Item> types = Arrays.asList(
                new Item("개인회원", "private"),
                new Item("사업자회원", "company")
        );

        return types;
    }

    private List<Item> getHobbies() { // label과 value를 직접 입력할 수 있도록 만듦 (Item.java)
        List<Item> hobbies = Arrays.asList(
                new Item("자바", "JAVA"),
                new Item("JSP", "JSP"),
                new Item("스프링", "SPRING"),
                new Item("스프링부트", "SPRINGBOOT")
        );

        return hobbies;
    }

    /*
    @InitBinder
    public void InitBinder(WebDataBinder binder) { // 공통적인 Validator
        binder.setValidator(joinValidator);
    }

     */

    /*
    private List<String> getHobbies() {
        List<String> hobbies = Arrays.asList("자바", "JSP", "스프링", "스프링부트");

        return hobbies;
    }
     */

    /*
    @PostMapping  // /member/join
    public String joinPs(@RequestParam(name="userId", required=false, defaultValue="없는 아이디") String memId, String userPw, boolean agree) {
        System.out.printf("userId=%s, userPw=%s, agree=%s%n", memId, userPw, agree);
        return null;
    }
     */
}