package com.cs.aspect;

import lombok.extern.log4j.Log4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Log4j
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.cs.controller.BookController.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        log.info(joinPoint.getSignature().getName() + " called...");
    }

    @After("execution( * com.cs.controller.BookController.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        log.info(joinPoint.getSignature().getName() + " finish...");
    }
}