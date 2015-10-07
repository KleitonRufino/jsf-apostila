package ajax;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class GeradorDeNumeroBean {

	private double numero;

	public double getNumero() {
		numero = Math.random();
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

}
