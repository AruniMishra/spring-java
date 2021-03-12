package com.mishra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		/*
		 * XmlBeanFactory is deprecated
		 */
		//BeanFactory bFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Alien obj = (Alien) bFactory.getBean("alien");

		ApplicationContext appContext  = new ClassPathXmlApplicationContext("spring.xml");
		
		Alien obj1 = (Alien) appContext.getBean("alien");
		obj1.age = 5;
		obj1.code();
		
		Alien obj2 = (Alien) appContext.getBean("alien");
		obj2.code();
		
		
		((ClassPathXmlApplicationContext) appContext).close();
	}
}