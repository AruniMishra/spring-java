package mishra.aruni.database;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mishra.aruni.database.jdbc.PersonJdbc;
import mishra.aruni.database.jdbc.entity.Person;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbc pesonjdbc;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users- {}", pesonjdbc.findAll());
		logger.info("find by id- {}", pesonjdbc.findById(10002));
		logger.info("delete by id- {}", pesonjdbc.deletebyId(10003));
		logger.info("insert Person- {}", pesonjdbc.insert(new Person(10004, "D", "D", new Date())));
		logger.info("update Person- {}", pesonjdbc.update(new Person(10004, "D-new", "D", new Date())));

	}
}
