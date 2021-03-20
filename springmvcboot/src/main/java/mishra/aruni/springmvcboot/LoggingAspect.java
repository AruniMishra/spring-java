package mishra.aruni.springmvcboot;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(public * mishra.aruni.springmvcboot.AlienController.getAliens())")
	public void logBefore() {
		LOGGER.info("getAliens invoked--Before");
	}
	
	@After("execution(public * mishra.aruni.springmvcboot.AlienController.getAliens())")
	public void logAfterFinally() {
		LOGGER.info("getAliens invoked--After(finally)");
	}
	
	@AfterReturning("execution(public * mishra.aruni.springmvcboot.AlienController.getAliens())")
	public void logAfterReturning() {
		LOGGER.info("getAliens invoked successfully--AfterReturning");
	}
	
	@AfterThrowing("execution(public * mishra.aruni.springmvcboot.AlienController.getAliens())")
	public void logAfterThrowing() {
		LOGGER.info("getAliens exception occured--AfterThrowing");
	}

}
