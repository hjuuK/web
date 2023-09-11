package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Member extends BaseEntity {    // 공통 속성으로 날짜와 시간 자동 추가
    @Id @GeneratedValue // 자동 증감 번호
    private Long userNo;

    @Column(length = 40, unique = true, nullable = false) // notnull, unique 제약조건
    private String userId;

    @Column(length = 65, nullable = false)
    private String userPw;

    @Column(length = 40, nullable = false)
    private String userNm;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 11)
    private String mobile;
}
