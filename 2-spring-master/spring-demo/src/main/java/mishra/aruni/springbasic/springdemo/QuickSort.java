package mishra.aruni.springbasic.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements SortAlgo {

	public int[] sort(int[] numbers) {

		//logic

		return numbers;

	}

}
