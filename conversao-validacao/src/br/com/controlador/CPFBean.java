package br.com.controlador;

import javax.faces.bean.ManagedBean;

import br.com.modelo.CPF;

@ManagedBean
public class CPFBean {

	private CPF cpf = new CPF();

	public CPF getCpf() {
		return cpf;
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

}
