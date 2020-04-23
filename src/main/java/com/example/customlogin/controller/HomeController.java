package com.example.customlogin.controller;


import com.example.customlogin.model.Quiz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    private List<Quiz> quiz;

    public HomeController() {
        this.quiz = new ArrayList<>();
        quiz.add(new Quiz("Sport","Takie koptyo. Kto uzyl takich slow, w odcinku Hejt-Park prowadzonym przez Mateusza Borka","?????"));
        quiz.add(new Quiz("Kulinaria","Wojciech Stawowy czy Wojciech Schabowy kto prowadzil miedzy innymi Arke i Cracovie?","??????"));
        quiz.add(new Quiz("Savoir-Vivre","Ja to sie nie wpierdalam czy nie wpraszam? Jak swoja szkoelnowia taktyke opisywal Pawel Janas","?????"));
        quiz.add(new Quiz("Jezyk Polski","Franciszek Smuda to trener skuteczny. Zapowiedzial walke o spadek i rzeczywiscie spadl. Z jakim klubem?","?????"));
    }

    //udostepniamy liste wszytskich quizow
    @GetMapping("/home")
    public  List<Quiz> quizList() {
        return quiz;
    }



}
