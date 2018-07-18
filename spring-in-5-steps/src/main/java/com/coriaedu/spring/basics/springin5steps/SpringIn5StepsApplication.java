package com.coriaedu.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are the beans?
	// Through the @Component annotation, we tell Spring which are the beans we want it to manage.

	// What are the dependencies of a bean?
	// We use @Autowired on the depencies within a bean.

	// Where to search for beans?
	// Spring Boot will scan the component packages through the @SpringBootApplication annotated class' package and sub packages.

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		System.out.println(result);

//		SpringApplication.run(SpringIn5StepsApplication.class, args);

	}
}
