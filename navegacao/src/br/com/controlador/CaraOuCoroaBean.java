package br.com.controlador;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CaraOuCoroaBean {

	public String proxima() {
		if (Math.random() < 0.5)
			return "cara";
		else
			return "coroa";
	}
}
