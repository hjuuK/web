package org.koreait.entities;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity { // 공통적인 자원으로 공유 목적 => 추상 클래스
    //@CreationTimestamp // 추가일자 => 쿼리시 실행
    @CreatedDate // 엔티티가 처음 추가 되면 생성
    private LocalDateTime regDt;

    //@UpdateTimestamp // 수정일자 => 쿼리시 실행
    @LastModifiedDate // 변화에 대한 데이터 감지를 위한 @EntityListeners와 같이 씀
    private LocalDateTime modDt;
}
