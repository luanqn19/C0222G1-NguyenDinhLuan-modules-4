package com.example.furuma_project.utils.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailConstraint, String> {
    @Override
    public void initialize (EmailConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid (String value , ConstraintValidatorContext context) {
        return value.matches("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
    }
}
