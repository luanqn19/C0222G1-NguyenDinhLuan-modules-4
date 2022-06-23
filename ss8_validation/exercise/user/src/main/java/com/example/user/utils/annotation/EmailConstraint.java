package com.example.user.utils.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(validatedBy = EmailValidator.class)
public @interface EmailConstraint {
    String message() default "Email không đúng định dạng VD: abc123@domain.com";
    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
