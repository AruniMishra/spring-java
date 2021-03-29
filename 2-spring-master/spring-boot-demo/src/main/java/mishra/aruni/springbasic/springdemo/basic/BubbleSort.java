package mishra.aruni.springbasic.springdemo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
//@Primary - use by name - Primary takes more priority then by Name
public class BubbleSort implements SortAlgo{

	public int[] sort(int[] numbers) {

		//logic

		return numbers;

	}

}
