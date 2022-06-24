package com.example.product_manager.utils.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(validatedBy = NameValidator.class)
public @interface NameConstraint {
    String message() default "";
    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
