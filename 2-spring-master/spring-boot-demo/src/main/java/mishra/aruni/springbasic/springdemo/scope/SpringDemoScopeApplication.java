package mishra.aruni.springbasic.springdemo.scope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ScopedProxyMode;

@SpringBootApplication
public class SpringDemoScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoScopeApplication.class); 

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoScopeApplication.class, args);
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		
		
		/*
		 * with ScopedProxyMode.TARGET_CLASS we get unique instances
		 */
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO.getJdbcConnection());
		
		LOGGER.info("------");
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());

	}

}
