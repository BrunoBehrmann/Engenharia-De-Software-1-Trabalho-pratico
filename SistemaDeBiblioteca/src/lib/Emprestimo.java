package lib;

import java.util.Date;

import lib.users.IUsuario;

public class Emprestimo {
	private IUsuario usuario;
	private Exemplar exemplar;
	private Date dataEmprestimo;
	private Date dataDevolucaoPrevista;
	
	public Emprestimo(IUsuario usuario, Exemplar exemplar) {
		this.usuario = usuario;
		this.exemplar = exemplar;
	}
	
	public Exemplar getExemplar() {
		return exemplar;
	}
	
}
