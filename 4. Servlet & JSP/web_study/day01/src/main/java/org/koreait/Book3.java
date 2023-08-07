package org.koreait;

import lombok.Builder;
import lombok.ToString;

@Builder @ToString
public class Book3 {
    @ToString.Exclude   // 타이틀 부분 출력 제외
    private String title;
    private String author;
    private String publisher;
}
