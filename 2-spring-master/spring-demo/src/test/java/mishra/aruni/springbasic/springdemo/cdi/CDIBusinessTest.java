package mishra.aruni.springbasic.springdemo.cdi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/*@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringDemoCdiApplication.class)*/
@ExtendWith(MockitoExtension.class)
class CDIBusinessTest {

	//create mock
	@Mock
	CdiDao cdidao;
	
	//@Autowired- used for spring context
	@InjectMocks
	CDIBusiness cdiBusiness;
	
	@Test
	void test() {
		Mockito.when(cdidao.getData()).thenReturn(new int[] {1,2,4,8,11});
		assertEquals(11, cdiBusiness.findLargest());
	}

}
