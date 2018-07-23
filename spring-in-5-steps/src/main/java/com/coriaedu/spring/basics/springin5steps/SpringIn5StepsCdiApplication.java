package com.coriaedu.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.coriaedu.spring.basics.springin5steps.cdi.SomeCdiBusiness;

@SpringBootApplication
public class SpringIn5StepsCdiApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {

		// Spring Application Context will manage all the beans:
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);

        SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

        logger.info("{} dao: {}", business, business.getSomeCdiDao());

	}
}
