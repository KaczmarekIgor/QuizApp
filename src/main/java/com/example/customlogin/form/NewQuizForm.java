package com.example.customlogin.form;


public class NewQuizForm {
    private String title;
    private String description;
    private String question;

    public NewQuizForm() {
    }

    public NewQuizForm(String title, String description, String question) {
        this.title = title;
        this.description = description;
        this.question = question;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "QuizForm{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
