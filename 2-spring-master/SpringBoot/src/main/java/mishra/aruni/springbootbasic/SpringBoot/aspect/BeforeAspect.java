package mishra.aruni.springbootbasic.SpringBoot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspect {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* mishra.aruni.springbootbasic.SpringBoot.repo.*.*(..))")
	public void before(JoinPoint joinPoint) {
		LOGGER.info("Before--mishra.aruni.springbootbasic.SpringBoot.repo.*.*(..) invoked - {}", joinPoint);
	}
	
	@Before("execution(* mishra.aruni.springbootbasic.SpringBoot..*.*(..))")
	public void parentPackage(JoinPoint joinPoint) {
		LOGGER.info("Before--mishra.aruni.springbootbasic.SpringBoot..*.*(..) invoked - {}", joinPoint);
	}
}
