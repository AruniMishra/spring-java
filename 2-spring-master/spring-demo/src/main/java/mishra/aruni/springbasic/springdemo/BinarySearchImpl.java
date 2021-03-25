package mishra.aruni.springbasic.springdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgo sortAlgo;

	/**
	 * @param sortAlgo
	 */
	public BinarySearchImpl(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}

	public int binarySearch(int[] numbers, int numberToSearch) {

		/*
		 * List<Integer> sortlist = Arrays.stream(numbers) .boxed() .filter(item ->
		 * item.equals(numberToSearch)) .sorted()
		 * .collect(Collectors.<Integer>toList());
		 * 
		 * System.out.println(sortlist);
		 */




		//Step 1.sort

		int[] sortedNumbers= sortAlgo.sort(numbers);
		System.out.println(sortAlgo);

		//Step 1.search

		return numberToSearch;

	}



}
