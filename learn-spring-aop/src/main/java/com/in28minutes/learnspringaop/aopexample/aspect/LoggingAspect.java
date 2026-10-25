package com.in28minutes.learnspringaop.aopexample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
    public void logMethodCallBefore(JoinPoint joinPoint){
        logger.info("Before Method - {} is called",joinPoint);
    }

    @After("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
    public void logMethodCallAfter(JoinPoint joinPoint){
        logger.info("After Method - {} has executed",joinPoint);
    }

    @AfterThrowing(
            pointcut = "execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))",
            throwing = "exception")
    public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception){
        logger.info("AfterThrowing Method - {} : exception has thrown {}",exception,joinPoint);
    }

    @AfterReturning(
            pointcut = "execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))",
            returning = "resultValue")
    public void logMethodCallAfterReturn(JoinPoint joinPoint, Object resultValue){
        logger.info("AfterReturning Method - {} has return {}",joinPoint,resultValue);
    }

}
