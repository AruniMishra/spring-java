package mishra.aruni.database.springdata;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mishra.aruni.database.springdata.entity.PersonSpringData;

@SpringBootApplication

public class SpringDataDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepo personSpringDataRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("-----------SpringDataDemoApplication-----------");
		logger.info("find by id- {}", personSpringDataRepo.findById(10001));
		logger.info("update for 10003- {}", personSpringDataRepo.save(new PersonSpringData(10003, "D", "delhi", new Date())));
		logger.info("insert ", personSpringDataRepo.save(new PersonSpringData("e", "e", new Date())));
		personSpringDataRepo.deleteById(10002);
		logger.info("find all- {} ", personSpringDataRepo.findAll());

	}
}
