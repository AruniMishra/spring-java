package mishra.aruni.springbootbasic.SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mishra.aruni.springbootbasic.SpringBoot.service.Business1;
import mishra.aruni.springbootbasic.SpringBoot.service.Business2;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		// LOGGER.info("BeanDefinitionNames: {}", Arrays.asList(applicationContext.getBeanDefinitionNames()));
		List<String> beans = Arrays.asList(applicationContext.getBeanDefinitionNames());
		//beans.forEach(bean -> LOGGER.info("BeanDefinitionNames: {}", bean));
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info(business1.calculateSomething());
		LOGGER.info(business2.calculateSomething());
	}
}
