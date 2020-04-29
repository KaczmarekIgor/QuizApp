package com.example.customlogin.controller;


import com.example.customlogin.dto.QuizDTO;
import com.example.customlogin.form.NewQuizForm;
import com.example.customlogin.service.QuizService;
import com.example.customlogin.validator.NewQuizFormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/quiz")
public class QuizController {


    private final QuizService quizService;
    private final NewQuizFormValidator validator;


    public QuizController(QuizService quizService, NewQuizFormValidator validator) {
        this.quizService = quizService;
        this.validator = validator;
    }

    @RequestMapping
    public ModelAndView getQuizPage() {
        ModelAndView mnv = new ModelAndView("quiz");
        List<QuizDTO> quizzes = quizService.getAllQuizzes();
        mnv.addObject("quizzes", quizzes);
        mnv.addObject("message", "XD");
        return mnv;
    }

    @RequestMapping("/{idQuiz}")
    public ModelAndView getQuizById(@PathVariable long idQuiz) {
        ModelAndView mnv = new ModelAndView("quiz");
        mnv.addObject("quiz", idQuiz);
        return mnv;
    }

    @GetMapping("/newquiz")
    public ModelAndView newQuizPage() {
        ModelAndView mnv = new ModelAndView("newQuiz");
        mnv.addObject("newQuiz", new NewQuizForm());
        return mnv;
    }
}