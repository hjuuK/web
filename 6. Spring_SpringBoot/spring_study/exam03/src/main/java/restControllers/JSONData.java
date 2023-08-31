package restControllers;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class JSONData<T> {
    private boolean success; // false : 실패 / true : 성공
    private HttpStatus status = HttpStatus.OK; // 기본값 : 성공 (200)
    private T data;
    private String message; // 오류 메세지
}
