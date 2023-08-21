package exam06.models.member;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
    private String userId;
    private String userPw;
    private String userNm;
    private LocalDateTime regDt;
    private String regDtStr; // 문자열로 형식화한 날짜
}
