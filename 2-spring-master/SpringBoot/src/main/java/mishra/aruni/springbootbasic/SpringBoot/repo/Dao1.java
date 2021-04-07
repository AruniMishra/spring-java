package mishra.aruni.springbootbasic.SpringBoot.repo;

import org.springframework.stereotype.Repository;

/**
 * for AOP demo
 * 
 * @author Aruni Mishra
 *
 */
@Repository
public class Dao1 {

	public String retrieveSomething() {
		return "Dao1";

	}

}
