package mishra.aruni.springbasic.springdemo.cdi;

import javax.inject.Named;

@Named
public class CdiDao {

	public int[] getData() {
		return new int[] {1,21};
	}
}
