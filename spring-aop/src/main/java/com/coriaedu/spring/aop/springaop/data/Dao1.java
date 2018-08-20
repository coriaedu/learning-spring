package com.coriaedu.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.coriaedu.spring.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething() throws Exception {
        return "dao1";
    }
}
