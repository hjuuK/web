package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private String publisher;
}
