package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
                //.regDt(LocalDateTime.now())
                .build();

        em.persist(member); // 영속성 안에 존재
        em.flush();
    }

    @Test
    void test1() {
        em.clear(); // 엔티티 비우기 => 엔티티 없는 상태이기 때문에 쿼리 수행 O
        Member member = em.find(Member.class, 1L); // 이미 영속성 컨텍스트 안에 존재하고 있으면 쿼리 수행 X => 그냥 값을 가져옴(캐시 역할) // SELECT 문 수행 -> 엔티티 -> 영속 상태
        System.out.println(member);

        Member member2 = em.find(Member.class, 1L); // 영속성 컨텍스트의 엔티티 조회 => 이미 엔티티가 존재하기 때문에 쿼리 수행 X
        System.out.println(member2);

        System.out.println(member == member2); // member와 member2는 동일한 객체임
    }

    @Test
    void test2() {
        Member member = em.find(Member.class, 1L);
        member.setUserNm("(수정)사용자01");
        //em.flush();

        Member member2 = em.find(Member.class, 1L); // flush() 먼저 수행 -> 조회 // 기존 결과를 DB에 먼저 반영을 해야하기 때문에
        System.out.println(member2);
    }
}
