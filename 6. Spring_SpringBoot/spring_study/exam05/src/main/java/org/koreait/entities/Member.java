package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.koreait.constants.Role;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="es_member")  // 명칭하는대로 테이블 만들기
@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class Member extends BaseEntity {
    @Id // 기본키 (필수항목 - 적어도 한 개 이상의 기본키가 있어야 동작함)
    @GeneratedValue  // 증감번호 (기본값:AUTO)
    private Long userNo;

    @Column(name="memId", length=40, unique = true, nullable = false) // unique 제약조건 걸기 // length 기본은 255자 //nullabe = false : NOTNULL
    private String userId; // DB에서는 memId로 셋팅

    @Column(length=65, nullable = false)
    private String userPw;

    @Column(length=40, nullable = false)
    private String userNm;

    //@Lob
    @Transient  // DB필드로 생성되지 않음 // 내부적으로 생성할때 사용
    private String introduction;

    @Enumerated(EnumType.STRING) // ENUM 함수 // ORDINAL을 쓰면 추가할때 순번이 바뀌는 불상사가 일어날 수도 있기 때문에 거의 사용 X
    private Role role;

    /*
    @Temporal(TemporalType.TIME)    // TIME : 시간만, TIMESTAMP : 날짜와 시간
    private Date date;
     */
}
