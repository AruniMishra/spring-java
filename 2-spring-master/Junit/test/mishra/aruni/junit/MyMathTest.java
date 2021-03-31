package mishra.aruni.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyMathTest {

	@Test
	public void test() {
		
		MyMath myMath = new MyMath();
		
		assertEquals(10, myMath.sum(new int[]{1,2,3,4}));
	}
	
}