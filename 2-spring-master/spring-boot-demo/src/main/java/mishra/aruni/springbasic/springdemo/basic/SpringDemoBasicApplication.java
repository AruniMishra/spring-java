package mishra.aruni.springbasic.springdemo.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("mishra.aruni.springbasic.springdemo.basic")
public class SpringDemoBasicApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoBasicApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl1);

		
		
		/* BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSort()); */

		int result = binarySearchImpl.binarySearch(new int[] { 4, 5, 6, 1, 99, 302, -2, 0, 2, 3, 7, 8, 11, 155, 1, 9, 10 }, 5);
		System.out.println(result);
		
		applicationContext.close();

	}

}
