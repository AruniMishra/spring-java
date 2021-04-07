package mishra.aruni.springbootbasic.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mishra.aruni.springbootbasic.SpringBoot.repo.Dao2;

/**
 * for AOP demo
 * 
 * @author Aruni Mishra
 *
 */
@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;

	public String calculateSomething() {
		return dao2.retrieveSomething();
	}
}
