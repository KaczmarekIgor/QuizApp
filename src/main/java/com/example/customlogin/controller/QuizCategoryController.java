package com.example.customlogin.controller;


import com.example.customlogin.form.QuizCategoryForm;
import com.example.customlogin.form.QuizForm;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuizCategoryController {

    private List<QuizCategoryForm> quizCategoryList;


    public QuizCategoryController() {
        this.quizCategoryList = new ArrayList<>();
        quizCategoryList.add(new QuizCategoryForm("Kategoria 1. 30 sekund"));
        quizCategoryList.add(new QuizCategoryForm("Kategoria 2. Polskie kluby w pucharach - życie i twórczość"));
        quizCategoryList.add(new QuizCategoryForm("Kategoria 3. Astronomia i Astrologia"));
        quizCategoryList.add(new QuizCategoryForm("Kategoria 4. Biologia"));
        quizCategoryList.add(new QuizCategoryForm("Kategoria 5. Cytaty"));
        quizCategoryList.add(new QuizCategoryForm("Kategoria 6. Kulinaria"));
        quizCategoryList.add(new QuizCategoryForm("Kategoria 7. Patryk Lipski - osąd bohatera"));
        quizCategoryList.add(new QuizCategoryForm("Kategoria 8. Rozmaitości"));
        quizCategoryList.add(new QuizCategoryForm("Kategoria 9. Sędziowie"));
        quizCategoryList.add(new QuizCategoryForm("Kategoria 10.Trzy kolory"));
        quizCategoryList.add(new QuizCategoryForm("Kategoria 11. Wielcy Polacy"));

    }

    // pobieranie listy quizow
    @GetMapping("/quizPage")
    public ModelAndView quizCategory() {
        ModelAndView mvn = new ModelAndView("quizPage");
        mvn.addObject("quizCategory", quizCategoryList);
        return mvn;
    }



}
