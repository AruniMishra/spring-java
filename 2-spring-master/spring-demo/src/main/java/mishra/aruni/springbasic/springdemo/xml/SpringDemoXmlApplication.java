package mishra.aruni.springbasic.springdemo.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("mishra.aruni.springbasic.springdemo.xml")
public class SpringDemoXmlApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoXmlApplication.class);
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext classPathXmlApplicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");) {
			LOGGER.info("Beans -> {} ", (Object)classPathXmlApplicationContext.getBeanDefinitionNames());

			XmlPersonDAO xmlPersonDAO = classPathXmlApplicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}, {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());
		}
	}
}