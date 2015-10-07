package br.com.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.modelo.Carro;

@ManagedBean
// @RequestScoped
// No escopo request, as instâncias dos managed beans são criadas durante o
// processamento de uma requisição assim que forem necessárias e descartadas no
// ﬁnal desse mesmo processamento.
// Assim,osdadosnãosãomantidosdeumarequisiçãoparaoutra

// @ViewScoped
// O escopo view foi adicionado no JSF2.
// A ideia é manter determinados dados enquanto o usuário não mudar de tela.
// As instânciados managed beans em escopo view são eliminadas somente quando
// há uma navegação entre telas

// @SessionScoped
// As instâncias dos managed beans conﬁgurados com o escopo session são criadas
// quando necessárias durante o processamento de uma requisição e armazenadas na
// session do usuário que fez a requisição

@ApplicationScoped
// As instancias dos managed beans conﬁgurados com escopo application sao
// criadas no primeiro momento em que elas são utilizadas em
// e mantidas ate aplicacao ser ﬁnalizada.
public class CarroBean {

	private List<Carro> carros = new ArrayList<>();
	private Carro carro = new Carro();

	public void adicionaCarro() {
		this.carros.add(carro);
		this.carro = new Carro();
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

}
