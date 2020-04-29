package com.example.customlogin.controller;


import com.example.customlogin.exception.NotFoundQuizExcpetion;
import com.example.customlogin.exception.UserExistsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalHandlerController {

    @ExceptionHandler( NotFoundQuizExcpetion.class)
    public ModelAndView quizNotFound(Exception e){
        return getModelAndView(e);
    }


    @ExceptionHandler(UserExistsException.class)
    public ModelAndView userExistsException(Exception e){
        return getModelAndView(e);
    }

    private ModelAndView getModelAndView(Exception e) {
        ModelAndView modelAndView = new ModelAndView("errorPage");
        modelAndView.addObject("message", e.getMessage());
        return modelAndView;
    }




}
