package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.koreait.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional // test가 끝나면 DB에 있는 내용이 다시 rollback됨
@TestPropertySource(locations="classpath:application-test.properties") // 이게 없으면 application.properties에 연결됨
public class Ex01 {
    @PersistenceContext // @Autowired와 동일한 기능으로 의존성 주입
    private EntityManager em;

    @Test
    void test1() {
        Member member = Member.builder()
                .userNo(1L)
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                //.regDt(LocalDateTime.now())
                .build();

        em.persist(member);
        em.flush();

        em.detach(member); // 영속성 분리 -> 변화감지 X (쿼리 수행 X)

        member.setUserNm("수정(사용자01)"); // 상태변화감지로 인해 update 쿼리 실행
        em.flush();

        em.merge(member); // 분리된 영속 상태 -> 영속 상태로 넣어줌 => 변화 감지 O (쿼리 실행 O) // select 쿼리를 통해 기존 상태와 비교 -> update 쿼리로 데이터 수정
        em.flush();

        /*
        em.remove(member); // delete 쿼리
        em.flush();
         */
    }
}
