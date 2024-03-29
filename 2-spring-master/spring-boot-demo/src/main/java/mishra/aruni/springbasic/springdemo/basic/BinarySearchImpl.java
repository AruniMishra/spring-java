package mishra.aruni.springbasic.springdemo.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	/*
	 * by using qualifier
	 */
	// @Qualifier("quick")
	// private SortAlgo sortAlgo;

	/*
	 * by using Name
	 */
	private SortAlgo bubbleSort;

	/*
	 * using setter- optional though, both constructor and setter can be skiped.
	 * public void setSortAlgo(SortAlgo sortAlgo) { this.sortAlgo = sortAlgo; }
	 * 
	 */


	/**
	 * using constructor
	 * 
	 * @param sortAlgo
	 */
	/*
	public BinarySearchImpl(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}
	 */

	public int binarySearch(int[] numbers, int numberToSearch) {

		/*
		 * List<Integer> sortlist = Arrays.stream(numbers) .boxed() .filter(item ->
		 * item.equals(numberToSearch)) .sorted()
		 * .collect(Collectors.<Integer>toList());
		 * 
		 * System.out.println(sortlist);
		 */

		// Step 1.sort

		int[] sortedNumbers = bubbleSort.sort(numbers);
		System.out.println(bubbleSort);

		// Step 1.search

		return numberToSearch;

	}

	@PostConstruct
	public void postConstruct() {

		LOGGER.info("----@PostConstruct()----");

	}

	@PreDestroy
	public void preDestroy() {

		LOGGER.info("----@PreDestroy()----");

	}

}
