package controllers.member;

import com.mysql.cj.xdevapi.Schema;
import lombok.RequiredArgsConstructor;
import models.member.MemberDao;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator {

    private final MemberDao memberDao;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(JoinForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) { // 검증
        JoinForm joinForm = (JoinForm)target;
//
//        /**
//         * 1. 필수 항목 검증 (userId, userPw, userPwRe, userNm) , null, "", "   "
//         *
//         */
////        String userId = joinForm.getUserId();
////        String userPw = joinForm.getUserPw();
////        String userPwRe = joinForm.getUserPwRe();
////        String userNm = joinForm.getUserNm();
////
////        if (userId == null || userId.isBlank()) {
////            errors.rejectValue("userId", "required", "아이디를 입력하세요.");
////        }
////
////        if (userPw == null || userPw.isBlank()) {
////            errors.rejectValue("userPw", "required", "비밀번호를 입력하세요.");
////        }
////
////        if (userPwRe == null || userPwRe.isBlank()) {
////            errors.rejectValue("userPwRe", "required", "비밀번호를 확인하세요.");
////        }
////
////        if (userNm == null || userNm.isBlank()) {
////            errors.rejectValue("userNm", "required", "회원명을 입력하세요.");
////        }     => 안쓰게 됨 => ValidationUtils.rejectIfEmptyOrWhitespace(); 사용
//
//        /*
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPw", "required");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPwRe", "required");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userNm", "required");
//         */

        /**
         * 1. 아이디 중복 여부 체크
         * 2. 비번(userPw)과 비번 확인(userPwRe) 일치 여부
         * 3. 휴대전화번호(필수 X) -> 입력된 경우는 형식 체크
         */

        String userId = joinForm.getUserId();
        String userPw = joinForm.getUserPw();
        String userPwRe = joinForm.getUserPwRe();
        String mobile = joinForm.getMobile();

        // 1. 아이디 중복 여부 체크
        if (memberDao.exists(userId)) {
            errors.rejectValue("userId", "duplicate");
        }

        // 2. 비번(userPw)과 비번 확인(userPwRe) 일치 여부
        if (userPw != null && !userPw.isBlank() && userPwRe != null && !userPwRe.isBlank() && !userPw.equals(userPwRe)) {
            errors.rejectValue("usePwRe", "mismatch");
        }

        // 3. 휴대전화번호(필수 X) -> 입력된 경우는 형식 체크
        if (mobile != null && !mobile.isBlank()) {
            /**
             * 1) 형식 통일화 010-0000-0000 010.0000.0000 -> 숫자로 변환
             * 2) 패턴
             *      010, 016, 011
             */

            mobile = mobile.replaceAll("\\D", ""); // 숫자가 아닌 문자들은 전부 제거

            String pattern = "^01[016]\\d{3,4}\\d{4}$"; // ^01로 시작하고 $4자리로 끝나는 패턴
            if (!mobile.matches(pattern)) { // 휴대전화 번호 형식이 아닌 경우
                errors.rejectValue("mobile", "format");
            }

            //errors.reject("commonError", "공통 오류 출력!!");
        }
    }
}
