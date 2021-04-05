package mishra.aruni.springbatch.batch;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import mishra.aruni.springbatch.model.User;

@Component
public class Processor implements ItemProcessor<User, User>{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class);

	private static final Map<String, String> DEPT_NAMES = new HashMap<>();

	public Processor() {
		DEPT_NAMES.put("A", "Development");
		DEPT_NAMES.put("B", "Support");
		DEPT_NAMES.put("C", "Testing");
	}

	@Override
	public User process(User user) throws Exception {

		String deptCode = user.getDept();
		String dept = DEPT_NAMES.get(deptCode);
		user.setDept(dept);

		LOGGER.info("Data converted from {} to {} ", deptCode, dept);
		return user;
	}

}
