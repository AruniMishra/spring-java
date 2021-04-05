package mishra.aruni.springbootbasic.SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static final Logger LOGGER= LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		//LOGGER.info("BeanDefinitionNames: {}", Arrays.asList(applicationContext.getBeanDefinitionNames()));
		List<String> beans = Arrays.asList(applicationContext.getBeanDefinitionNames());
		beans.forEach(bean -> LOGGER.info("BeanDefinitionNames: {}", bean));

	}
}
 