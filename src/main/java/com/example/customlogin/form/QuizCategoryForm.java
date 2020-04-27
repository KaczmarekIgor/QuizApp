package com.example.customlogin.form;

public class QuizCategoryForm {

    private String category;

    public QuizCategoryForm() {
    }

    public QuizCategoryForm(String category) {
        this.category = category;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "QuizCategory{" +
                "category='" + category + '\'' +
                '}';
    }
}
