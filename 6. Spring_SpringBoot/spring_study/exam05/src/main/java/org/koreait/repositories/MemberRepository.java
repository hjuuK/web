package org.koreait.repositories;

import org.koreait.entities.Member;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> { // JpaRepository<Entity, 기본키>
    Member findByUserId(String userId); // 구현체 생성 -> 외부에서 메소드엿던 구현 내용이 바로 추가

    List<Member> findByUserNmContaining(String keyword, Pageable pageAble); // like %키워드%

    List<Member> findByUserNmContainingOrderByUserIdDesc(String keyword); // 내림차순으로 정렬

    List<Member> findByUserNmContainingOrUserIdContainingOrderByUserIdDesc(String keyword1, String keyword2);

    @Query("SELECT m FROM Member m WHERE m.userNm LIKE %:key1% OR m.userId LIKE %:key2% ORDER BY m.userId DESC")
    List<Member> getList(@Param("key1") String keyword1, @Param("key2") String keyword2);  // JPQL

}
