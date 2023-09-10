package controllers.member;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginForm {
    @NotBlank
    private String userId;
    @NotBlank
    private String userPw;
    private boolean saveId; // Id 저장 기능
}
