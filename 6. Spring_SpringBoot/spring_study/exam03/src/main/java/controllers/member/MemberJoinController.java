package controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/member/join")  // 공통적인 주소
public class MemberJoinController {
    @GetMapping  // /member/join
    //@RequestMapping(method=RequestMethod.GET, path="/member/join")
    public String join(Model model) {
        model.addAttribute("joinForm", new JoinForm()); // springform 사용 -> GET방식에 이걸 넣어야만 오류가 없음 (???)

        //List<String> hobbies = getHobbies();
        List<Item> hobbies = getHobbies();
        model.addAttribute("hobbies", hobbies);

        return "member/join2";
    }

    @PostMapping
    public String joinPs(JoinForm form, Model model) { // 커맨드 객체 // joinForm -> joinForm : EL 속성 추가
        //model.addAttribute("joinForm", joinForm); // join.sjp => EL식으로 데이터 사용 -> 주입
        //System.out.println(form);

        //List<String> hobbies = getHobbies();
        List<Item> hobbies = getHobbies();
        model.addAttribute("hobbies", hobbies);

        return "member/join2";
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