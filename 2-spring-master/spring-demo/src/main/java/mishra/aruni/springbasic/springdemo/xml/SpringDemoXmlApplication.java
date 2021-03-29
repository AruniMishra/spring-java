package mishra.aruni.springbasic.springdemo.xml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("mishra.aruni.springbasic.springdemo.xml")
public class SpringDemoXmlApplication {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext classPathXmlApplicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");) {
			
			XmlPersonDAO xmlPersonDAO = classPathXmlApplicationContext.getBean(XmlPersonDAO.class);
			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXmlJdbcConnection());
		}
	}
}