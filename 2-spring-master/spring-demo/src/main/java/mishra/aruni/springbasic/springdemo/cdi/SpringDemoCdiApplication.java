package mishra.aruni.springbasic.springdemo.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("mishra.aruni.springbasic.springdemo.cdi")
public class SpringDemoCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoCdiApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringDemoCdiApplication.class);) {

			CDIBusiness cdiBusiness = applicationContext.getBean(CDIBusiness.class);

			LOGGER.info("CDIBusiness- {} ;  CdiDao- {}", cdiBusiness, cdiBusiness.getCdidao());
		}

	}
}
