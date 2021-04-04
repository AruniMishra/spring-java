package mishra.aruni.springbootbasic.SpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static final Logger LOGGER= LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		
		LOGGER.info("BeanDefinitionNames: {}", (Object)applicationContext.getBeanDefinitionNames());
	}

}
