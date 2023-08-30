package controllers.member;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SearchForm {
    private LocalDate sDate;
    private LocalDate eDate;
}
