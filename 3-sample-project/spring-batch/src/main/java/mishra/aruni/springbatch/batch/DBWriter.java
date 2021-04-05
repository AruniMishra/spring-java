package mishra.aruni.springbatch.batch;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mishra.aruni.springbatch.model.User;
import mishra.aruni.springbatch.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DBWriter.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends User> users) throws Exception {

		LOGGER.info("Data saved for users: {}", users);
		userRepository.saveAll(users);
	}

}
