package com.example.customlogin.controller;


import com.example.customlogin.form.QuizForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/quiz")
public class QuizController {


    private List<QuizForm> quiz;

    public QuizController() {
        this.quiz = new ArrayList<>();
        quiz.add(new QuizForm("Kulinaria", "Wojciech Stawowy czy Wojciech Schabowy kto prowadzil miedzy innymi Arke i Cracovie?", "??????"));
        quiz.add(new QuizForm("Savoir-Vivre", "Ja to sie nie wpierdalam czy nie wpraszam? Jak swoja szkoleniowa taktyke opisywal Pawel Janas", "?????"));
        quiz.add(new QuizForm("Jezyk Polski", "Franciszek Smuda to trener skuteczny. Zapowiedzial walke o spadek i rzeczywiscie spadl. Z jakim klubem?", "?????"));
    }

    //udostepniamy liste wszytskich quizow
    @RequestMapping
    public ModelAndView quizList() {
        ModelAndView mvn = new ModelAndView("quiz");
        mvn.addObject("quizList", quiz);
        return mvn;
    }


}
