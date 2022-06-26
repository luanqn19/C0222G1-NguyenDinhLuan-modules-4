package com.example.furuma_project.utils.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(validatedBy = AddressValidator.class)
public @interface AddressConstraint {
    String message() default "Địa chỉ không đúng định dạng";
    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
