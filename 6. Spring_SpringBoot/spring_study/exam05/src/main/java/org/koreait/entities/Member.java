package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.koreait.constants.Role;

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
    @Lob
    private String introduction;

    @Enumerated(EnumType.STRING) // ENUM 함수 // ORDINAL을 쓰면 추가할때 순번이 바뀌는 불상사가 일어날 수도 있기 때문에 거의 사용 X
    private Role role;

    @CreationTimestamp // 추가일자
    private LocalDateTime regDt;

    @UpdateTimestamp // 수정일자
    private LocalDateTime modDt;
}
