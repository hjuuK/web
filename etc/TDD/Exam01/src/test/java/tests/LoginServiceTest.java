package tests;

import commons.BadRequestException;
import jakarta.servlet.http.HttpServletRequest;
import models.member.LoginService;
import models.member.ServiceManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@DisplayName("로그인 기능 테스트")
public class LoginServiceTest {

    private LoginService service;
    private HttpServletRequest request;

    @BeforeEach
    void init() {
        service = ServiceManager.getInstance().loginService();
        request = mock(HttpServletRequest.class);
    }

    private void getRequestData(String userId, String userPw) {
        given(request.getParameter("userId")).willReturn(userId);
        given(request.getParameter("userPw")).willReturn(userPw);
    }

    private void getSuccessData() {
        getRequestData("user" + System.currentTimeMillis(), "12345678");
    }

    @Test
    @DisplayName("로그인 성공시 예외 없음")
    void loginSuccessTest() {
        getSuccessData();
        service.login(request);
    }

    @Test
    @DisplayName("필수 항목(userId, userPw) 검증, 실패시 BadRequestException발생")
    void requiredFieldTest() {
        assertAll(
                () -> requiredFieldEachTest(null, "123456", "아이디"),
                () -> requiredFieldEachTest("    ", "123456", "아이디"),
                () -> requiredFieldEachTest("user" + System.currentTimeMillis(), null, "비밀번호"),
                () -> requiredFieldEachTest("user" + System.currentTimeMillis(), "      ", "비밀번호")
        );
    }

    private void requiredFieldEachTest(String userId, String userPw, String word) {
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
            getRequestData(userId, userPw);
            service.login(request);
        });

        assertTrue(thrown.getMessage().contains(word));
    }
}