package models.member;

public class DuplicateMemberException extends RuntimeException {
    public DuplicateMemberException() {
        super("이미 등록된 회원입니다.");
    }
}
