package tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Ex02Test {
    @TempDir
    File dir; // 테스트 실행시 알아서 임시 경로 생성 / 임시 폴더는 주기적으로 제거됨

    // All 은 처음과 끝에 한 번씩만 수행 (정적메서드로 static) / Each 는 각 테스트 메서드마다 전후로 모두 수행
    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll!");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach!");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach!");
    }

    @Test
    @DisplayName("테스트1")
    void test1() {
        System.out.println("테스트1");
        System.out.println(dir.getAbsolutePath());
    }

    @Test
    @DisplayName("테스트2")
    @Disabled // 테스트 실행하지 않음 (배제)
    void test2() {
        System.out.println("테스트2");
    }

    @Test
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS) // 2초 안에 실행되지 않으면 실패됨 // 기본값 : SECONDS
    void test3() throws InterruptedException {
        Thread.sleep(4000);
    }
}
