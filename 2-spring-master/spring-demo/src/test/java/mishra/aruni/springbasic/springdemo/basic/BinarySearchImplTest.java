package mishra.aruni.springbasic.springdemo.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringDemoBasicApplication.class)
class BinarySearchImplTest {

	@Autowired
	BinarySearchImpl binarySearchImpl;
	
	@Test
	void test() {
		int result = binarySearchImpl.binarySearch(new int[] {1,2,6,8}, 4);
		
		assertEquals(4, result);
	}

}
