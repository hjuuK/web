package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.koreait.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class Ex02 {
    @PersistenceContext
    private EntityManager em;

    @BeforeEach // 각각의 테스트 전에 직접 먼저 수행
    void init() {
        Member member = Member.builder()
                .userNo(1L)
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .regDt(LocalDateTime.now())
                .build();

        em.persist(member); // 영속성 안에 존재
        em.flush();
    }
}
