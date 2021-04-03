package mishra.aruni.springbasic.springdemo.cdi;

import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIBusiness {
	
	@Inject
	CdiDao cdidao;

	public CdiDao getCdidao() {
		return cdidao;
	}

	public void setCdidao(CdiDao cdidao) {
		this.cdidao = cdidao;
	}
	
	public int findLargest() {
		int[] data = cdidao.getData();
		int max = Arrays.stream(data).max().getAsInt();
		return max;
	}
}
