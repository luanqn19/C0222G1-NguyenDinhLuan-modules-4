package com.example.music.utils.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(validatedBy = TypeValidator.class)
public @interface TypeConstraint {
    String message() default "Thể loại bài hát không hợp lệ";
    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
