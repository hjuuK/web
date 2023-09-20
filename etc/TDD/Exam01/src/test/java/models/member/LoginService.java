package models.member;

import jakarta.servlet.http.HttpServletRequest;

public class LoginService {

    private LoginValidator validator;

    public LoginService(LoginValidator validator) {
        this.validator = validator;
    }

    public void login(HttpServletRequest request) {
        validator.check(request);
    }
}