package mishra.aruni.springbasic.springdemo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSort implements SortAlgo {

	public int[] sort(int[] numbers) {

		//logic

		return numbers;

	}

}
