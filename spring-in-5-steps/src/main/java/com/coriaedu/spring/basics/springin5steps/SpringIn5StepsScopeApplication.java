package com.coriaedu.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coriaedu.spring.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan("")
public class SpringIn5StepsScopeApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {

		// Spring Application Context will manage all the beans:
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringIn5StepsScopeApplication.class);

        PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

        PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

        logger.info("{}", personDao);
        logger.info("{}", personDao.getJdbcConnection());

        logger.info("{}", personDao2);
        logger.info("{}", personDao2.getJdbcConnection());

	}
}
