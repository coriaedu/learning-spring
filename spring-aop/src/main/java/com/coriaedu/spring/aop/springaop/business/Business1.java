package com.coriaedu.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coriaedu.spring.aop.springaop.data.Dao1;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao;

    public String calculateSomething() {
        // Business Logic
        return dao.retrieveSomething();
    }
}
