package mishra.aruni.springbasic.springdemo.cdi;

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

}
