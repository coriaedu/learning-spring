package com.coriaedu.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.coriaedu.spring.basics.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan("") // current package
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

    public static void main(String[] args) {

        // Spring Application Context will manage all the beans:
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringIn5StepsPropertiesApplication.class)) {

            SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

            System.out.println(service.returnServiceURL());

        }
    }
}
