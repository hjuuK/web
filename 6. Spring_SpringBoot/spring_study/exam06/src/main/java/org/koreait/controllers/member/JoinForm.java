package org.koreait.controllers.member;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class JoinForm { // 가입 양식을 담을 수 있는 커맨드 객체
    @NotBlank
    @Size(min=6) // 6자리 이상
    private String userId;

    @NotBlank
    @Size(min=8) // 8자리 이상
    private String userPw;

    @NotBlank
    private String userPwRe;

    @NotBlank
    private String userNm;

    @Email
    @NotBlank
    private String email;
    private String mobile;

    @AssertTrue
    private boolean agree;
}
