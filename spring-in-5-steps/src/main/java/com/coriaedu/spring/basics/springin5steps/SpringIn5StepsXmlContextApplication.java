package com.coriaedu.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coriaedu.spring.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXmlContextApplication {

    // What are the beans?
    // Through the @Component annotation, we tell Spring which are the beans we want it to manage.
    // If we are not using Spring Boot, we can use just Spring and use the @Configuration and @ComponentScan annotations.

    // What are the dependencies of a bean?
    // We use @Autowired on the dependencies within a bean.

    // Before Spring 2.5, beans, dependencies and configuration was done through XML files loaded from the classpath

    // Where to search for beans?
    // Spring Boot will scan the component packages through the @SpringBootApplication annotated class' package and sub packages.
    // If using just Spring, @ComponentScan("") is used.

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

    public static void main(String[] args) {

        // Spring Application Context will manage all the beans:
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) { // no need to provide path as this is in the Classpath (main/resources)

            // what are all the beans loaded?
            logger.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

            XmlPersonDAO person = applicationContext.getBean(XmlPersonDAO.class);

            logger.info("Person: {} - Connection: {}", person, person.getXmlJdbcConnection());

        }
    }
}
