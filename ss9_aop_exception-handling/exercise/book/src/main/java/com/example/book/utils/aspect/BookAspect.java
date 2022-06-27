package com.example.book.utils.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAspect {
    private static int count = 1;

    @After("execution(* com.example.book.controller.BookController.*(..))")
    public void logAfterMethodController (JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name);
        System.out.println("Lượng người truy cập " + count);
        count++;
    }
}
