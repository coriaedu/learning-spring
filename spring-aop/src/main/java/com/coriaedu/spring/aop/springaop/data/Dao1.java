package com.coriaedu.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    public String retrieveSomething() throws Exception {
        throw new Exception("NOT LIKE THIS!");
    }
}
