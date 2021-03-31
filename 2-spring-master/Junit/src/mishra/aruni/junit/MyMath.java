package mishra.aruni.junit;

import java.util.stream.IntStream;

public class MyMath {

	public int sum(int[] numbers) {

		return IntStream.of(numbers).sum();

	}
}
