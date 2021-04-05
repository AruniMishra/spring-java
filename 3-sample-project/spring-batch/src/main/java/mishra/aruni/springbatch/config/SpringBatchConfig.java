package mishra.aruni.springbatch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import mishra.aruni.springbatch.model.User;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {

	@Bean
	public Job job(JobBuilderFactory jobBuilderFactory,
			StepBuilderFactory stepBuilderFactory,
			ItemReader<User> itemReader,
			ItemProcessor<User, User> itemProcessor,
			ItemWriter<User> itemWriter) {

		Step step = stepBuilderFactory.get("ETL-file-load")
				.<User, User>chunk(1)
				.reader(itemReader)
				.processor(itemProcessor)
				.writer(itemWriter)
				.build();

		return jobBuilderFactory.get("ETL-LOAD")
				.incrementer(new RunIdIncrementer())
				.start(step)
				.build();
	}


	@Bean
	public FlatFileItemReader<User> ItemReader(@Value("${input.file}")FileSystemResource resource){
		FlatFileItemReader<User> fileItemReader = new FlatFileItemReader<>();

		fileItemReader.setResource(resource);
		fileItemReader.setName("CSV-Reader");
		fileItemReader.setLinesToSkip(1);
		fileItemReader.setLineMapper(lineMapper());

		return fileItemReader;
	}


	@Bean
	public LineMapper<User> lineMapper() {

		DefaultLineMapper<User> defaultLineMapper = new DefaultLineMapper<User>();

		DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer(",");
		delimitedLineTokenizer.setStrict(false);
		delimitedLineTokenizer.setNames("id", "namne", "dept", "salary");

		BeanWrapperFieldSetMapper<User> fieldSetMapper = new BeanWrapperFieldSetMapper<User>();
		fieldSetMapper.setTargetType(User.class);

		defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);
		defaultLineMapper.setFieldSetMapper(fieldSetMapper);

		return defaultLineMapper;
	}

}
