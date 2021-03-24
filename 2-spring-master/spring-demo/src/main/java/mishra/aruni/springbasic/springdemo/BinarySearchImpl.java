package mishra.aruni.springbasic.springdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearchImpl {

	public int binarySearch(int[] numbers, int numberToSearch) {

		/*
		 * List<Integer> sortlist = Arrays.stream(numbers) .boxed() .filter(item ->
		 * item.equals(numberToSearch)) .sorted()
		 * .collect(Collectors.<Integer>toList());
		 * 
		 * System.out.println(sortlist);
		 */

		//Step 1.sort
		//bubble sort
		BubbleSort bubbleSort= new BubbleSort();
		int[] sortedNumbers= bubbleSort.sort(numbers);

		//Step 1.search

		return numberToSearch;

	}

}
