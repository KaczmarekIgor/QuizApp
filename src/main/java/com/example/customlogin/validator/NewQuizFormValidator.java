package com.example.customlogin.validator;

import com.example.customlogin.form.NewQuizForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;



@Component
public class NewQuizFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return NewQuizFormValidator.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        NewQuizForm form = (NewQuizForm) o;
        if (form.getDescription().isBlank()) {
            errors.rejectValue("description", "newProductForm.validator.field.empty");
        }
    }
}
