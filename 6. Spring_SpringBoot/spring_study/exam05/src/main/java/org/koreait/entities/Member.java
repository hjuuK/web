package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class Member {
    @Id // 기본키 (필수항목 - 적어도 한 개 이상의 기본키가 있어야 동작함)
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private LocalDateTime regDt;
}
