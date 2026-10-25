package com.in28minutes.learnspringaop.aopexample.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Around("com.in28minutes.learnspringaop.aopexample.aspect.CommonPointcutConfig.businessPackageConfig()")
    public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // Start a timer
        Long startTime = System.currentTimeMillis();

        // Execute the method
        Object returnValue = proceedingJoinPoint.proceed();

        // Stop a timer
        Long endTime = System.currentTimeMillis();

        Long executeTime = endTime - startTime;

        logger.info("Around Aspect - {} method executed in {} ms",proceedingJoinPoint,executeTime);

        return returnValue;
    }
}
