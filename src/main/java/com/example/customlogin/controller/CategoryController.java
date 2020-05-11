package com.example.customlogin.controller;


import com.example.customlogin.dto.CategoryDTO;
import com.example.customlogin.service.category.CategoryService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping
    public ModelAndView viewCategories(Authentication authentication) {
        ModelAndView mnv = new ModelAndView("category/categories");
        mnv.addObject("category", categoryService.getCategories(authentication.getName()));
        return mnv;
    }

    @RequestMapping("/{idCategory}")
    public ModelAndView viewCategory(@PathVariable long idCategory) {
        ModelAndView mnv = new ModelAndView("category/categories");
        CategoryDTO categoryById = categoryService.getCategoryById(idCategory);
        mnv.addObject("category", categoryById);
        return mnv;
    }
}


