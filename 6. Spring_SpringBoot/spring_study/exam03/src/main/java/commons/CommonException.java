package commons;

import org.springframework.http.HttpStatus;

public class CommonException extends RuntimeException {
    private HttpStatus status;

    public CommonException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public CommonException(String message) {
        this(message, HttpStatus.INTERNAL_SERVER_ERROR); // 하나만 들어오면 INTERNAL_SERVER_ERROR 출력
    }

    public HttpStatus getStatus() {
        return status;
    }
}
