package com.example.customlogin.dto;


import lombok.*;

import java.util.List;

@Getter
@Setter

public class CategoryDTO {

    private long id;
    private String name;
    private List<QuizDTO> categories ;

    public CategoryDTO(long id, String name, List<QuizDTO> categories) {
        this.id = id;
        this.name = name;
        this.categories = categories;
    }

    public CategoryDTO() {
    }
}
