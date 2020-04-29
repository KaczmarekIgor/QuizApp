package com.example.customlogin.controller;


import com.example.customlogin.exception.UserExistsException;
import com.example.customlogin.form.LoginForm;
import com.example.customlogin.form.UserRegisterForm;
import com.example.customlogin.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {


    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/registration")
    public ModelAndView getUserFormPage() {
        ModelAndView mvn = new ModelAndView("home");
        mvn.addObject("form", new UserRegisterForm());
        return mvn;
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView mvn = new ModelAndView("login");
        mvn.addObject("login", new LoginForm());
        return mvn;
    }


    @PostMapping("/registration")
    public ModelAndView createUser(@ModelAttribute("form")
                                   @Validated UserRegisterForm userRegisterForm,
                                   BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("home");
        }
        try {
            userService.createUser(userRegisterForm);
        } catch (UserExistsException e) {
            ModelAndView modelAndView = new ModelAndView("home");
            modelAndView.addObject("message", e.getMessage());
            return modelAndView;
        }
        return new ModelAndView("redirect:/quizCategory");
    }
}


