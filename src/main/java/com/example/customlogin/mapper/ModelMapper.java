package com.example.customlogin.mapper;

import com.example.customlogin.dto.CategoryDTO;
import com.example.customlogin.dto.QuizDTO;
import com.example.customlogin.entity.Category;
import com.example.customlogin.entity.Quiz;

import java.util.List;
import java.util.stream.Collectors;

public final class ModelMapper {

    private ModelMapper() {

    }

    public static CategoryDTO map(Category category){
        List<QuizDTO> collect = category.getQuizzes().stream().map(ModelMapper::map).collect(Collectors.toList());
        return new CategoryDTO(category.getId(),category.getName(),collect);

    }

    public static QuizDTO map (Quiz quiz) {
        return new QuizDTO(quiz.getId(),quiz.getTitle(),quiz.getDescription(),quiz.getQuestion());
    }

}

