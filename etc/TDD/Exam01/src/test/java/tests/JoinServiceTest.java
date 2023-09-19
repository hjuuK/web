package tests;

import models.member.JoinService;
import models.member.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class JoinServiceTest {
    private JoinService joinService;

    @BeforeEach
    void init() {
        joinService = new JoinService();
    }

    private Member getMember() {
        return Member.builder()
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .email("user01@test.org")
                .build();
    }

    @AfterEach
    void after() {
        System.out.println("테스트 후!");
    }

    @Test
    @DisplayName("회원 가입 성공시 예외 발생 없음")
    void joinSuccessTest() {
        assertDoesNotThrow(() -> {
            joinService.join(getMember());
        });
    }

    @Test
    @DisplayName("필수 항목(userId, userNm, userPw) 체크, 필수 항목 누락시 BadRequestException 발생")
    void requiredFieldsTest() {

    }
}