package com.example.furuma_project.utils.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(validatedBy = PhoneValidator.class)
public @interface PhoneConstraint {
    String message() default "Số điện thoại không đúng định dạng VD: 09,03,84|xxxxxxxx";
    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
