package controllers.member;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class JoinForm { // 요청 데이터에 의한 전달 객체
    private String type = "private"; // 기본값 설정

    @NotBlank // 필수항목검증  // message="" 기본 메세지 : 공백일 수 없습니다.
    @Size(min=6, max=16)
    private String userId;

    @NotBlank
    @Size(min=8)
    private String userPw;

    @NotBlank
    private String userPwRe;

    @NotBlank
    private String userNm;

    @Email
    private String email;
    private String mobile;
    //private String[] hobby;
    //private List<String> hobby;
    //private Address address; // 중첩된 커맨드 객체(Address.java)
    //private String intro; // 자기소개 작이속애

    @AssertTrue     // 값이 True인지 검사
    private boolean agree;
}
