package com.coriaedu.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect // The combination of a Pointcut and an Advice
@Configuration // Configuration
public class UserAccessAspect {

    private static final Logger log = LoggerFactory.getLogger(UserAccessAspect.class);

    // Define what kind of method calls I would like to intercept
    // execution( * PACKAGE.*.*(..))
    // Weaving: Process where this whole things get weaved around our code is called Weaving.
    // Weaver: Framework that does weaving.
    @Before("execution(* com.coriaedu.spring.aop.springaop.data.*.*(..))") // This expression is called a Pointcut (what we want to intercept)
    public void before(JoinPoint joinPoint) { // A JoinPoint is specific interception of a method call.
        // What to do: This is called the Advice
        log.info("Check for user access");
        log.info("Allowed execution for {}", joinPoint);
    }

}
