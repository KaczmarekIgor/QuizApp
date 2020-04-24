package com.example.customlogin.controller;


import com.example.customlogin.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping
    public ModelAndView login() {
        ModelAndView mvn = new ModelAndView("login");
        mvn.addObject("login", new LoginForm());
        return mvn;
    }
}