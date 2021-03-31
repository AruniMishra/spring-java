package mishra.aruni.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class MyMathTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@Before
	public void beforeEach() {
		System.out.println("@BeforeEach");
	}

	@Test
	public void test() {
		MyMath myMath = new MyMath();
		assertEquals(10, myMath.sum(new int[] { 1, 2, 3, 4 }));
	}

	@Test
	public void testPairSum() {
		MyMath myMath = new MyMath();
		assertEquals(8, myMath.sum(new int[] { 2, 6 }));
	}
}