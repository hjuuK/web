package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class BoardData extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String subject;

    @Lob
    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY) // 다대일 관계 / Many: BoardData , One: Member // LAZY : 지연로딩
    @JoinColumn(name="userNo") // 외래키명 변경 / 기본 외래키명 : 엔티티명_기본키명 ex) member_user_no
    @ToString.Exclude // 순환참조의 무한반복을 방지하기 위한 방법 => toString() 제외됨
    private Member member;

    @ManyToMany(fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<HashTag> tags = new ArrayList<>();
}
