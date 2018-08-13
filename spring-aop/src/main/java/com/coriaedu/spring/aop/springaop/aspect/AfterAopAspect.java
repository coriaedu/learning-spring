package com.coriaedu.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect // The combination of a Pointcut and an Advice
@Configuration // Configuration
public class AfterAopAspect {

    private static final Logger log = LoggerFactory.getLogger(AfterAopAspect.class);

    // Define what kind of method calls I would like to intercept
    // execution( * PACKAGE.*.*(..))
    // Weaving: Process where this whole things get weaved around our code is called Weaving.
    // Weaver: Framework that does weaving.
    @AfterReturning(
            value = "execution(* com.coriaedu.spring.aop.springaop..*.*(..))",
            returning = "result") // This expression is called a Pointcut (what we want to intercept)
    public void afterReturning(JoinPoint joinPoint, Object result) { // A JoinPoint is specific interception of a method call.
        // What to do: This is called the Advice
        log.info(" {} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(value = "execution(* com.coriaedu.spring.aop.springaop..*.*(..))",
            throwing = "exception")
    public void afterThrowing(JoinPoint jp, Object exception) {
        log.info(" {} threw {}", jp, ((Throwable) exception).getMessage());
    }

    @AfterThrowing(value = "execution(* com.coriaedu.spring.aop.springaop..*.*(..))")
    public void after(JoinPoint jp) {
        log.info(" After execution of {}", jp);
    }

}
