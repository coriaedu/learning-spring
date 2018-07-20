package com.coriaedu.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.coriaedu.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {

		// Spring Application Context will manage all the beans:
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

        PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

        PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

        logger.info("{}", personDao);
        logger.info("{}", personDao.getJdbcConnection());

        logger.info("{}", personDao2);
        logger.info("{}", personDao2.getJdbcConnection());

	}
}
