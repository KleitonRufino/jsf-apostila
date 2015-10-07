package br.com.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.entidades.Curso;

@ManagedBean
public class CursosBean {

	private String siglaDoCursoEscolhido;
	private List<Curso> cursos = new ArrayList<>();
	private Curso curso = new Curso();

	public CursosBean() {
		this.cursos.add(new Curso("Orientação a Objetos em Java", "K11"));
		this.cursos.add(new Curso("Desenvolvimento Web com JSF2 e JPA2", "K12"));
	}

	public void adicionaCurso() {
		this.cursos.add(this.curso);
		this.curso = new Curso();
		FacesMessage message = new FacesMessage("Turma adicionada");
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void submete() {
		System.out.println(siglaDoCursoEscolhido);
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public String getSiglaDoCursoEscolhido() {
		return siglaDoCursoEscolhido;
	}

	public void setSiglaDoCursoEscolhido(String siglaDoCursoEscolhido) {
		this.siglaDoCursoEscolhido = siglaDoCursoEscolhido;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
