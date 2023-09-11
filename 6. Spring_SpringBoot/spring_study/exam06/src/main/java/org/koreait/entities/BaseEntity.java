package org.koreait.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass   // 상위 클래스
@EntityListeners(AuditingEntityListener.class)  // 정의된 방법 걍 외워.외워.외워.외워.
public abstract class BaseEntity {
    @CreatedDate // 변화 감지를 통해서 업데이트
    @Column(updatable = false)  // 추가한 값이 변하지 않음, 업데이트 X
    private LocalDateTime regDt;

    @LastModifiedDate
    @Column(insertable = false) // 추가 X / 수정할때만 값이 들어감
    private LocalDateTime modDt;
}
