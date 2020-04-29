package com.example.customlogin.repository;


import com.example.customlogin.entity.Category;
import com.example.customlogin.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    Optional<Quiz> findQuizById(long idQuiz);
}
