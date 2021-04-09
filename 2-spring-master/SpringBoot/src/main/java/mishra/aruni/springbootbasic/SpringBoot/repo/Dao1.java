package mishra.aruni.springbootbasic.SpringBoot.repo;

import org.springframework.stereotype.Repository;

import mishra.aruni.springbootbasic.SpringBoot.aspect.TrackTime;

/**
 * for AOP demo
 * 
 * @author Aruni Mishra
 *
 */
@Repository
public class Dao1 {

	@TrackTime
	public String retrieveSomething() {
		return "Dao1";

	}

}
