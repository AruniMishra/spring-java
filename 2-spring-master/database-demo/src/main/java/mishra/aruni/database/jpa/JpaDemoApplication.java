package mishra.aruni.database.jpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mishra.aruni.database.jpa.entity.PersonJpa;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepo pesonJpaRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("-----------JPA-----------");
		logger.info("find by id- {}", pesonJpaRepo.findById(10001));
		logger.info("update for 10003- {}", pesonJpaRepo.update(new PersonJpa(10003, "D", "delhi", new Date())));
		logger.info("insert ", pesonJpaRepo.update(new PersonJpa("e", "e", new Date())));

	}
}
