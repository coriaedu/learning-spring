package com.coriaedu.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coriaedu.spring.basics.springin5steps.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan("")
public class SpringIn5StepsCdiApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {

		// Spring Application Context will manage all the beans:
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringIn5StepsCdiApplication.class);

        SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

        logger.info("{} dao: {}", business, business.getSomeCdiDao());
        System.out.println(business + " dao: " + business.getSomeCdiDao());

	}
}
