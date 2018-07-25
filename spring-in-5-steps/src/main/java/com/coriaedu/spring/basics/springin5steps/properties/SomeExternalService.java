package com.coriaedu.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    // Get a value from properties file
    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL() {
        return url;
    }
}
