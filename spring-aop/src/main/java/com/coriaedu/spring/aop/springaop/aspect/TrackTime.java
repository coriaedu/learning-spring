package com.coriaedu.spring.aop.springaop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // Use it on methods only
@Retention(RetentionPolicy.RUNTIME) // I want to have the annotation information available at runtime
public @interface TrackTime {

}
