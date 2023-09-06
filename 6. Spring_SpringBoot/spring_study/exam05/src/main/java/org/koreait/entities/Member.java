package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name="es_member")  // 명칭하는대로 테이블 만들기
@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class Member {
    @Id // 기본키 (필수항목 - 적어도 한 개 이상의 기본키가 있어야 동작함)
    @GeneratedValue  // 증감번호 (기본값:AUTO)
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private LocalDateTime regDt;
}
