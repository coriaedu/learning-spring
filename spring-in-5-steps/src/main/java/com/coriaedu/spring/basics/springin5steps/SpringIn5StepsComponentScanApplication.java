package com.coriaedu.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.coriaedu.spring.basics.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.coriaedu.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {

		// Spring Application Context will manage all the beans:
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        logger.info("{}", componentDAO);

	}
}
