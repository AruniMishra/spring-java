package mishra.aruni.springbootbasic.SpringBoot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAspect {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* mishra.aruni.springbootbasic.SpringBoot.repo.*.*(..))")
	public void before(JoinPoint joinPoint) {
		LOGGER.info("Before--mishra.aruni.springbootbasic.SpringBoot.repo.*.*(..) invoked - {}", joinPoint);
	}

	/*
	 * //root package
	 * 
	 * @Before("execution(* mishra.aruni.springbootbasic.SpringBoot..*.*(..))")
	 * public void parentPackage(JoinPoint joinPoint) { LOGGER.
	 * info("Before--mishra.aruni.springbootbasic.SpringBoot..*.*(..) invoked - {}",
	 * joinPoint); }
	 */

	@AfterReturning(
			value="execution(* mishra.aruni.springbootbasic.SpringBoot.repo.*.*(..))",
			returning="result")
	public void afterRetrning(JoinPoint joinPoint, Object result) {
		LOGGER.info("AfterReturning-{} returned with value {}", joinPoint, result);
	}
	
	@AfterThrowing(
			value="execution(* mishra.aruni.springbootbasic.SpringBoot.repo.*.*(..))",
			throwing="exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		LOGGER.info("AfterReturning-{} returned with value {}", joinPoint, exception);
	}
}
