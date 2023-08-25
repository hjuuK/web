package controllers.member;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // 생성자 매개변수
public class Item {
    private String label;
    private String value;
}
