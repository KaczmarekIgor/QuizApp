package com.example.customlogin.dto;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class QuizDTO {
    private long id;
    private String title;
    private String description;
    private String question;


}
