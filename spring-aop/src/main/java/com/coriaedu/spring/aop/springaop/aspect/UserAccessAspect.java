package com.coriaedu.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect // AOP
@Configuration // Configuration
public class UserAccessAspect {

    private static final Logger log = LoggerFactory.getLogger(UserAccessAspect.class);

    // Define what kind of method calls I would like to intercept
    // execution( * PACKAGE.*.*(..))

    @Before("execution(* com.coriaedu.spring.aop.springaop.business.*.*(..))")
    public void before(JoinPoint joinPoint) {
        // What to do
        log.info("Check for user access");
        log.info("Allowed execution for {}", joinPoint);
    }

}
