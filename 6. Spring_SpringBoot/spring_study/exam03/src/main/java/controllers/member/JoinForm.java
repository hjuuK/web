package controllers.member;

import lombok.Data;

import java.util.List;

@Data
public class JoinForm { // 요청 데이터에 의한 전달 객체
    private String userId;
    private String userPw;
    private String userPwRe;
    private String userNm;
    private String email;
    private String mobile;
    //private String[] hobby;
    private List<String> hobby;
    private Address address; // 중첩된 커맨드 객체(Address.java)
    private boolean agree;
}
