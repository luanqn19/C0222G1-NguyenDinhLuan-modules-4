package com.example.blog.utils.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<NameConstraint, String> {
    @Override
    public void initialize (NameConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid (String value , ConstraintValidatorContext context) {
        return value.matches("^([A-Za-z]\\s*?)+$");
    }
}
