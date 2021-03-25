package mishra.aruni.springbasic.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgo{

	public int[] sort(int[] numbers) {

		//logic

		return numbers;

	}

}
