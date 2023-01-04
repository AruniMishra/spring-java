package mishra.aruni.database.jdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mishra.aruni.database.jdbc.entity.Person;

@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcRepo pesonJdbcRepo;

	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("JDBC All users- {}", pesonJdbcRepo.findAll());
		logger.info("find by id- {}", pesonJdbcRepo.findById(10002));
		logger.info("delete by id- {}", pesonJdbcRepo.deletebyId(10003));
		logger.info("insert Person- {}", pesonJdbcRepo.insert(new Person(10004, "D", "D", new Date())));
		logger.info("update Person- {}", pesonJdbcRepo.update(new Person(10004, "D-new", "D", new Date())));
	}
}
