package mishra.aruni.springbasic.springdemo.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mishra.aruni.springbasic.springdemo.cdi.SpringDemoCdiApplication;

@Configuration
@ComponentScan("mishra.aruni.springbasic.springdemo.scope")
public class SpringDemoScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoScopeApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringDemoScopeApplication.class);) {

			PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

			LOGGER.info("{}", personDAO);

			/*
			 * with ScopedProxyMode.TARGET_CLASS we get unique instances
			 */
			LOGGER.info("{}", personDAO.getJdbcConnection());
			LOGGER.info("{}", personDAO.getJdbcConnection());

			LOGGER.info("------");
			LOGGER.info("{}", personDAO2);
			LOGGER.info("{}", personDAO2.getJdbcConnection());

		}
	}

}
