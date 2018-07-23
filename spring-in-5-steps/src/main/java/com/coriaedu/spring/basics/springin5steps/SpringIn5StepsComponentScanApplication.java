package com.coriaedu.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coriaedu.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.coriaedu.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {

		// Spring Application Context will manage all the beans:
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringIn5StepsComponentScanApplication.class);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        logger.info("{}", componentDAO);
        System.out.println(componentDAO);

	}
}
