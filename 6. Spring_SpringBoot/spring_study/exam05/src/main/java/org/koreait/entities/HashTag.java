package org.koreait.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class HashTag {
    @Id
    private String tag;

    @ManyToMany(mappedBy = "tags")
    private List<BoardData> boardDatas = new ArrayList<>();
}
