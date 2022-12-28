package mishra.aruni;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // BeanFactory beanFactory = new XmlBeanFactory(new
        // FileSystemResource("spring.xml"));
        // Alien obj = (Alien) beanFactory.getBean("alien");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) applicationContext.getBean("alien");

        
        obj1.code();
        System.out.println("age:" + obj1.getAge());

        
        
    }
}
