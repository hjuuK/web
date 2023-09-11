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

    private String userId;

    private String userPw;

    private String userNm;

    private String email;

    private String mobile;
}
