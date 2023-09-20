package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("tes222")
public class Ex01Test {
    @Test
    @DisplayName("test111")
    void test1() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;

        assertEquals(30, result); // (예상값, 결과)
    }
}