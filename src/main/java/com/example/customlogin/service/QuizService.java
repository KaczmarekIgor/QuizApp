package com.example.customlogin.service;


import com.example.customlogin.dto.QuizDTO;
import com.example.customlogin.exception.NotFoundQuizExcpetion;
import com.example.customlogin.mapper.ModelMapper;
import com.example.customlogin.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizService {
    private QuizRepository repository;

    public QuizService(QuizRepository repository) {
        this.repository = repository;
    }

    public List<QuizDTO> getAllQuizzes() {
        return repository.findAll().stream()
                .map(ModelMapper::map)
                .collect(Collectors.toList());

    }
// szukanie quizu, jesli nie ma takiego quizu wyrzuc wyjatek
    public QuizDTO getQuizById(long id){
        return repository.findQuizById(id)
                .map(ModelMapper::map).orElseThrow(()-> new NotFoundQuizExcpetion("nie ma takiego quizu"));
    }
}
