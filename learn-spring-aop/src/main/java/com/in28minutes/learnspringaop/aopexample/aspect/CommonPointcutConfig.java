package com.in28minutes.learnspringaop.aopexample.aspect;

import org.aspectj.lang.annotation.DeclareAnnotation;
import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

    @Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
    public void businessPackageConfig(){}

}
