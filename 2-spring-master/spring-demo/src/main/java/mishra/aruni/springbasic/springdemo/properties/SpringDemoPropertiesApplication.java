package mishra.aruni.springbasic.springdemo.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("mishra.aruni.springbasic.springdemo.properties")
@PropertySource("classpath: app.properties")
public class SpringDemoPropertiesApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext(SpringDemoPropertiesApplication.class);) {

			SomeExternalService someExternalService = 
					annotationConfigApplicationContext.getBean(SomeExternalService.class);
			
			System.out.println(someExternalService.fetchServiceUrl());
		}
	}
}