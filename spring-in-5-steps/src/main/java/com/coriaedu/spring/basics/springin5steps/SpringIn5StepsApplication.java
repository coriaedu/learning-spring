package com.coriaedu.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are the beans?
	// Through the @Component annotation, we tell Spring which are the beans we want it to manage.

	// What are the dependencies of a bean?
	// We use @Autowired on the depencies within a bean.

	// Where to search for beans?
	// Spring Boot will scan the component packages through the @SpringBootApplication annotated class' package and sub packages.

	public static void main(String[] args) {

		// Spring Application Context will manage all the beans:
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        // getting a bean again from the context will return a new instance or the same one, depending on the Bean Scope (singleton / prototype)
        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch);
        System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		System.out.println(result);


	}
}
