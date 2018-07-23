package com.coriaedu.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Sorting an array
        System.out.println(sortAlgorithm);
        int[] sorted = sortAlgorithm.sort(numbers);


		// Search the array

		// Return the index of the result
		return 3;
	}

    @PostConstruct
    public void postConstruct() {
        logger.info("Post Construct");
        logger.info("SortAlgorithm: {}", sortAlgorithm);
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("Pre Destroy");
    }
}
