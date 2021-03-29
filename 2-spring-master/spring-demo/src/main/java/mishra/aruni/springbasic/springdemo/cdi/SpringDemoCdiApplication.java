package mishra.aruni.springbasic.springdemo.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoCdiApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoCdiApplication.class, args);

		CDIBusiness cdiBusiness = applicationContext.getBean(CDIBusiness.class);

		LOGGER.info("CDIBusiness- {} ;  CdiDao- {}", cdiBusiness, cdiBusiness.getCdidao());

	}
}
