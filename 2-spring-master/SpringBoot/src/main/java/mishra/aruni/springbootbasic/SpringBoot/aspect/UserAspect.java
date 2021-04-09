package mishra.aruni.springbootbasic.SpringBoot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAspect {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	/*
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

	/*
	@AfterReturning(
			value="execution(* mishra.aruni.springbootbasic.SpringBoot.repo.*.*(..))",
			returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		LOGGER.info("AfterReturning-{} returned with value {}", joinPoint, result);
	}

	@AfterThrowing(
			value="execution(* mishra.aruni.springbootbasic.SpringBoot.repo.*.*(..))",
			throwing="exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		LOGGER.info("AfterThrowing-{} returned with value {}", joinPoint, exception);
	}

	@Around(value="execution(* mishra.aruni.springbootbasic.SpringBoot.service.*.*(..))")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime= System.currentTimeMillis();
		proceedingJoinPoint.proceed();
		long timeTaken= System.currentTimeMillis() - startTime;
		LOGGER.info("Around- Time take by {} returned is {}", proceedingJoinPoint, timeTaken);
	}


	 */
	
	// create a common file for all pointcut
	@Before("mishra.aruni.springbootbasic.SpringBoot.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void beforePointcut(JoinPoint joinPoint) {
		LOGGER.info("BeforePointcut--mishra.aruni.springbootbasic.SpringBoot.aspect.CommonJoinPointConfig.dataLayerExecution(): ", joinPoint);
	}
	
	@Around("mishra.aruni.springbootbasic.SpringBoot.aspect.CommonJoinPointConfig.serviceLayerExecution()")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime= System.currentTimeMillis();
		proceedingJoinPoint.proceed();
		long timeTaken= System.currentTimeMillis() - startTime;
		LOGGER.info("Around- Time take by {} returned is {}", proceedingJoinPoint, timeTaken);
	}
	
	@Around("mishra.aruni.springbootbasic.SpringBoot.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public void aroundTrackTimeAnnotation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime= System.currentTimeMillis();
		proceedingJoinPoint.proceed();
		long timeTaken= System.currentTimeMillis() - startTime;
		LOGGER.info("trackTimeAnnotation- Time take by {} returned is {}", proceedingJoinPoint, timeTaken);
	}
	
}
