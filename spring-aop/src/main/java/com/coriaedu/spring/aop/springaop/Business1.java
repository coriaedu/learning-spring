package com.coriaedu.spring.aop.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao;

    public String calculateSomething() {
        // Business Logic
        return dao.retrieveSomething();
    }
}
