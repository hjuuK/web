package org.koreait.tests;

import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.controllers.board.BoardForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.yml")
@AutoConfigureMockMvc
@Transactional
public class BoardSaveTest {
    @Autowired
    private MockMvc mockMvc;

    private BoardForm form;

    @BeforeEach
    void init() {
        form = new BoardForm();
        form.setPoster("작성자");
        form.setSubject("제목");
        form.setContent("내용");
    }

    @Test
    @DisplayName("(통합)게시글 등록 성공시 응답 코드 201")
    void successTest() throws Exception {
        mockMvc.perform(post("/api/board")
                .param("poster", form.getPoster())
                .param("subject", form.getSubject())
                .param("content", form.getContent()))
                .andDo(print()) // 응답과 요청에 대한 내용들을 자세하게 확인할 수 있음
                .andExpect(status().isCreated())
                .andExpect(header().string("Content-type", StringContains.containsString("application/json")));
    }

    @Test
    @DisplayName("(통합)작성자(post)가 누락되었을때 작성자를 입력하세요 문구 포함 여부, 응답 코드 400")
    void requiredFiledTest1() throws Exception {
        String body = mockMvc.perform(post("/api/board")
                             .param("subject", form.getSubject())
                             .param("content", form.getContent()))
                             .andDo(print())
                             .andExpect(status().isBadRequest()) // 400 응답코드
                             .andReturn() // 응답 코드에 대한 데이터
                             .getResponse().getContentAsString(Charset.forName("UTF-8"));
        assertTrue(body.contains("작성자"));
    }
}
