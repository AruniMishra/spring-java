package mishra.aruni.springbasic.springdemo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
//@Primary - use by name - Primary takes more priority than by Name
public class BubbleSort implements SortAlgo{

	public int[] sort(int[] numbers) {

		//logic

		return numbers;

	}

}
