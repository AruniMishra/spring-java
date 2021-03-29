package mishra.aruni.springbasic.springdemo.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("mishra.aruni.springbasic.springdemo.basic")
public class SpringDemoBasicApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext(SpringDemoBasicApplication.class);) {
			
			

			BinarySearchImpl binarySearchImpl = annotationConfigApplicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearchImpl);

			int result = binarySearchImpl
					.binarySearch(new int[] { 4, 5, 6, 1, 99, 302, -2, 0, 2, 3, 7, 8, 11, 155, 1, 9, 10 }, 5);
			System.out.println(result);
		}

	}

}
