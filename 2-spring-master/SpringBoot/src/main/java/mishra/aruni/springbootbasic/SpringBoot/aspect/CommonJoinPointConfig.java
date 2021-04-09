package mishra.aruni.springbootbasic.SpringBoot.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonJoinPointConfig {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Pointcut("execution(* mishra.aruni.springbootbasic.SpringBoot.repo.*.*(..))")
	public void dataLayerExecution() {
		LOGGER.info("@Pointcut--mishra.aruni.springbootbasic.SpringBoot.repo.*.*(..) invoked");
	}

	@Pointcut("execution(* mishra.aruni.springbootbasic.SpringBoot.service.*.*(..))")
	public void serviceLayerExecution() {
		LOGGER.info("@Pointcut--mishra.aruni.springbootbasic.SpringBoot.service.*.*(..) invoked");
	}

	@Pointcut("@annotation(mishra.aruni.springbootbasic.SpringBoot.aspect.TrackTime)")
	public void trackTimeAnnotation() {
	}

}
