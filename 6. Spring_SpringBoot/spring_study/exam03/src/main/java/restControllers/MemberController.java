package restControllers;

import commons.CommonException;
import controllers.member.JoinForm;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import models.member.DuplicateMemberException;
import models.member.JoinService;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberDao memberDao;
    private final JoinService joinService;

    @GetMapping("/{id}")
    public ResponseEntity<Member> info(@PathVariable("id") String userId) {
        Member member = memberDao.get(userId);

        return ResponseEntity.ok(member); // 
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

    /*
    @postMapping("/register")
    public ResponseEntity<Object> register(@RequestBody JoinForm form) { // 요청 데이터를 해석해서 넣어줌
        joinService.join(form);

        //return ResponseEntity.status(HttpStatus.CREATED).build(); // build() => 응답 상태만 있고 바디는 없음 // CREATED = 201

        //return ResponseEntity.status(HttpStatus.CREATED).body(form); // body() => 응답 할 때 body에 출력됨
        
        return ResponseEntity.created(URI.create("/member//login")).build(); // 응답 데이터 없이 201
    }
     */

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody @Valid JoinForm form, Errors errors, HttpServletResponse response) {
        if (errors.hasErrors()) {
            String messages = errors.getAllErrors().stream().map(o -> o.getDefaultMessage()).collect(Collectors.joining());
            
            throw new RuntimeException(messages);  // error
        }

        joinService.join(form); // DuplicateMemberException -> CommonException

        return ResponseEntity.created(URI.create("/member/login")).build();     // 정상
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<JSONData<Object>> errorHandler(Exception e) {
//        return ResponseEntity
//                .status(HttpStatus.BAD_REQUEST)
//                .body(new String[] {e.getMessage()}); // ResponseEntity<Object>

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if (e instanceof CommonException) {
            CommonException commonException = (CommonException)e;
            status = commonException.getStatus();
        }

        JSONData<Object> data = new JSONData<>();
        data.setSuccess(false);
        data.setMessage(e.getMessage());
        data.setStatus(status);

        return ResponseEntity.status(status).body(data);
    }
}
