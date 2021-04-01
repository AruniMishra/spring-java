package mishra.aruni.springsecurity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import mishra.aruni.springsecurity.impl.BusinessImpl;
import mishra.aruni.springsecurity.service.DataService;

class BusinessTest {

	@Test
	void findLargestData() {
		
		DataService dataService = mock(DataService.class);
		
		when(dataService.retrieveAllData()).thenReturn(new int[] {2,5,3,9,11});
		BusinessImpl businessImpl = new BusinessImpl(dataService);
		
		int largestData = businessImpl.findLargestData();
		
		assertEquals(11, largestData );
	}
}