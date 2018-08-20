package com.coriaedu.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect // The combination of a Pointcut and an Advice
@Configuration // Configuration
public class MethodExecutionCalculationAspect {

    private static final Logger log = LoggerFactory.getLogger(MethodExecutionCalculationAspect.class);

    @Around(value = "com.coriaedu.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        long startTime = System.currentTimeMillis();

        jp.proceed();

        long timeTaken = System.currentTimeMillis() - startTime;

        log.info("Time taken for {} was {} millisenconds.", jp, timeTaken);
    }

}
