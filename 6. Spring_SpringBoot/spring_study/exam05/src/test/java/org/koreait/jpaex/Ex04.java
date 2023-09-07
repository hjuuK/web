package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.constants.Role;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.domain.Sort.Order.asc;
import static org.springframework.data.domain.Sort.Order.desc;  // Sort.by.Order.desc

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class Ex04 {
    @Autowired // 의존성 주입
    private MemberRepository repository;
    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        List<Member> members = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Member member = Member.builder()
                    .userId("user" + i)
                    .userPw("123456")
                    .userNm("사용자" + i)
                    .role(Role.USER)
                    .build();
            members.add(member);
        }

        repository.saveAllAndFlush(members);
    }

    @Test
    void test1() {
        List<Member> members = repository.findAll();    // 전체 조회
        members.stream().forEach(System.out::println);
    }

    @Test
    void test2() {
        em.clear(); // 엔티티 제거
        Member member = repository.findById(1L).orElse(null);   // 기본키로 한개 조회

        System.out.println(member);

        repository.delete(member);
        repository.flush();
    }

    @Test
    void test3() {
        Member member = repository.findByUserId("user2");
        System.out.println(member);
    }

    @Test
    void test4() {
        //Pageable pageable = PageRequest.of(0, 3); // LIMIT 0, 3 // 3개만 조회 // 1, 2, 3
        Pageable pageable = PageRequest.of(1, 3,
                Sort.by(desc("userId"), asc("userNo")));
                // 또 다시 1부터 조회하면 4, 5, 6 이 조회됨 // 1차는 userId로, 2차는 userNo로 정렬
        List<Member> members = repository.findByUserNmContaining("용", pageable);
        members.stream().forEach(System.out::println);
    }

    @Test
    void test5() {
        List<Member> members = repository.findByUserNmContainingOrderByUserIdDesc("용");
        members.stream().forEach(System.out::println);
    }

    @Test
    void test6() {
        List<Member> members = repository.findByUserNmContainingOrUserIdContainingOrderByUserIdDesc("용", "ser");
        members.stream().forEach(System.out::println);
    }

    @Test
    void test7() {
        List<Member> members = repository.getList("용", "ser");
        members.stream().forEach(System.out::println);
    }

    @Test
    void test8() {
        List<Member> members = repository.getList2("용", "ser");
        members.stream().forEach(System.out::println);
    }

}
