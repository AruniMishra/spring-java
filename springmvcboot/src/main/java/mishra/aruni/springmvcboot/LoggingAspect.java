package mishra.aruni.springmvcboot;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(public * mishra.aruni.springmvcboot.AlienController.getAliens(..))")
	public void log() {
		System.out.println("getAliens invoked");
	}

}
