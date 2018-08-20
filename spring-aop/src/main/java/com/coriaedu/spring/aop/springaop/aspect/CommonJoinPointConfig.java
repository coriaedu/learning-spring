package com.coriaedu.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.coriaedu.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* com.coriaedu.spring.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() {
    }

    @Pointcut("com.coriaedu.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() com.coriaedu.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void allLayersExecution() {
    }

    @Pointcut("bean(*dao*)")
    public void beanContainingDao() {
    }

    @Pointcut("within(com.coriaedu.spring.aop.springaop.data..*)")
    public void dataLayerExecutionWithWithin() {
    }
}
