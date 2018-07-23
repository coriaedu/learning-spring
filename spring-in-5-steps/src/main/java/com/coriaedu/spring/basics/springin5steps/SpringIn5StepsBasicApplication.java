package com.coriaedu.spring.basics.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coriaedu.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("") // current package
public class SpringIn5StepsBasicApplication {

	// What are the beans?
	// Through the @Component annotation, we tell Spring which are the beans we want it to manage.
    // If we are not using Spring Boot, we can use just Spring and use the @Configuration and @ComponentScan annotations.

	// What are the dependencies of a bean?
    // We use @Autowired on the dependencies within a bean.

	// Where to search for beans?
	// Spring Boot will scan the component packages through the @SpringBootApplication annotated class' package and sub packages.
    // If using just Spring, @ComponentScan("") is used.

	public static void main(String[] args) {

		// Spring Application Context will manage all the beans:
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringIn5StepsBasicApplication.class);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        // getting a bean again from the context will return a new instance or the same one, depending on the Bean Scope (singleton / prototype)
        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch);
        System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		System.out.println(result);


	}
}
