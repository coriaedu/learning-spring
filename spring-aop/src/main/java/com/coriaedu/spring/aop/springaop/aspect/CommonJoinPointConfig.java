package com.coriaedu.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.coriaedu.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* com.coriaedu.spring.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() {
    }

    @Pointcut("execution(* com.coriaedu.spring.aop.springaop..*.*(..))")
    public void allLayersExecution() {
    }
}
