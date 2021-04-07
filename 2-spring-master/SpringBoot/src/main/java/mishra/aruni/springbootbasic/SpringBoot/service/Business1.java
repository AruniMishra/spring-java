package mishra.aruni.springbootbasic.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mishra.aruni.springbootbasic.SpringBoot.repo.Dao1;

/**
 * for AOP demo
 * 
 * @author Aruni Mishra
 *
 */
@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;

	public String calculateSomething() {
		return dao1.retrieveSomething();
	}
}
