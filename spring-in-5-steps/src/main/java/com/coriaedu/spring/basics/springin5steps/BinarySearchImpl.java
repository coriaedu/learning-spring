package com.coriaedu.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Sorting an array
		System.out.println(sortAlgorithm);
		int[] sorted = sortAlgorithm.sort(numbers);


		// Search the array

		// Return the index of the result
		return 3;
	}
}
