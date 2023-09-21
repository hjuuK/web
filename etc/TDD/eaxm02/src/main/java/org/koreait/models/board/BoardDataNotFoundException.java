package org.koreait.models.board;

public class BoardDataNotFoundException extends RuntimeException {
    public BoardDataNotFoundException() {
        super("등록되지 않은 게시글입니다.");
    }
}
