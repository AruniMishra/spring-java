package mishra.aruni.springbasic.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);

		BinarySearchImpl binary = new BinarySearchImpl();

		int result = binary.binarySearch(new int[] { 4, 5, 6, 1, 99, 302, -2, 0, 2, 3, 7, 8, 11, 155, 1, 9, 10 }, 5);
		System.out.println(result);

	}

}
