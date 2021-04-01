package mishra.aruni.springsecurity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import mishra.aruni.springsecurity.impl.BusinessImpl;
import mishra.aruni.springsecurity.service.DataService;

@SpringBootTest
class BusinessMockAnnotationTest {

	@Mock
	DataService dataService;

	@InjectMocks
	BusinessImpl businessImpl;

	@Test
	void findLargestData() {

		when(dataService.retrieveAllData()).thenReturn(new int[] { 2, 5, 3, 9, 11 });
		int largestData = businessImpl.findLargestData();

		assertEquals(11, largestData);
	}
}