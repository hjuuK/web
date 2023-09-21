package org.koreait.commons;

import org.springframework.http.HttpStatus;

public class CommonException extends RuntimeException { // 공통적인 예외클래스 -> 응답코드가 정해질 수 있도록
    private HttpStatus status;

    public CommonException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public CommonException(String message) {
        super(message);
        this.status = HttpStatus.INTERNAL_SERVER_ERROR; // 500대 코드
    }

    public HttpStatus getStatus() {
        return status;
    }
}
