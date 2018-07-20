package com.coriaedu.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

	@Override
    public int[] sort (int[] numbers) {
		// logic for Bubble sort
		return numbers;
	}
}
