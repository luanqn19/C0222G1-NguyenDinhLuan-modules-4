package com.example.furuma_project.utils.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<PhoneConstraint, String> {

    @Override
    public void initialize (PhoneConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid (String value , ConstraintValidatorContext context) {
        return value.matches("^(\\+84|0[3|9])+([0-9]{8})$");
    }
}
