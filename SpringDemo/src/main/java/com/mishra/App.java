package com.mishra;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App {
    BeanFactory bFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

    Alien obj = (Alien) bFactory.getBean("alien");

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}