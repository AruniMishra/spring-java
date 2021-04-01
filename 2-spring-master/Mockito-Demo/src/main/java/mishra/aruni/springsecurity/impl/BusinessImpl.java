package mishra.aruni.springsecurity.impl;

import java.util.Arrays;
import mishra.aruni.springsecurity.service.DataService;

public class BusinessImpl {

	private DataService dataService;

	/**
	 * constructor is not needed if we use @SpringBootTest
	 * 
	 * @param dataService
	 */
	public BusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findLargestData() {
		int[] retrieveAllData = dataService.retrieveAllData();
		int max = Arrays.stream(retrieveAllData).max().getAsInt();
		return max;
	}

}