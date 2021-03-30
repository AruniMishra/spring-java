package mishra.aruni.springbasic.springdemo.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Qualifier("quick")
	private SortAlgo sortAlgo;

	public int binarySearch(int[] numbers, int numberToSearch) {

		return numberToSearch;
	}

	@PostConstruct
	public void postConstruct() {
		LOGGER.info("----@PostConstruct()----");
	}

	@PreDestroy
	public void preDestroy() {
		LOGGER.info("----@PreDestroy()----");
	}
}
