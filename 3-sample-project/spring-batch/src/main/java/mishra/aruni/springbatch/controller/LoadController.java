package mishra.aruni.springbatch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoadController {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoadController.class);
	
	@Autowired
	JobLauncher jobLauncher;
	
	@Autowired
	Job job;
	
	
	@GetMapping("load")
	public BatchStatus load() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		
		JobParameters jobParameters = new JobParameters();
		JobExecution jobExecution = jobLauncher.run(job, jobParameters);
		
		while (jobExecution.isRunning()) {
			LOGGER.info("JobExecution is running: {}", jobExecution.getStatus());
		}
		
		LOGGER.info("JobExecution: {}", jobExecution.getStatus());
		
		return jobExecution.getStatus();
	}

}
