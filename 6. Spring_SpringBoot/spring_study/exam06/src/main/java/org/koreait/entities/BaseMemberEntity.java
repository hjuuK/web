package org.koreait.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter @Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseMemberEntity extends BaseEntity { // BaseEntity + α
    @CreatedBy
    @Column(length = 40, updatable = false)
    String createdBy; // 처음에 추가한 사용자 아이디

    @LastModifiedBy
    @Column(length = 40, insertable = false)
    String modifiedBy; // 수정한 사용자의 아이디

}
