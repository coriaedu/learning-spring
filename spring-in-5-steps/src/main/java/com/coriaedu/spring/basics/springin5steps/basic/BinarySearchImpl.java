package com.coriaedu.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	@Autowired
    @Qualifier("bubble")
    private SortAlgorithm quickSortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Sorting an array
        System.out.println(quickSortAlgorithm);
        int[] sorted = quickSortAlgorithm.sort(numbers);


		// Search the array

		// Return the index of the result
		return 3;
	}
}
