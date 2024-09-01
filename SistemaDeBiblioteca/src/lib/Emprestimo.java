package lib;

import java.io.ObjectInputFilter.Status;
import java.util.Date;

import lib.users.IUsuario;

public class Emprestimo {
	private IUsuario usuario;
	private Exemplar exemplar;
	private Date dataEmprestimo;
	private Date dataDevolucaoPrevista;
	private boolean status;
	
	public Emprestimo(IUsuario usuario, Exemplar exemplar) {
		this.usuario = usuario;
		this.exemplar = exemplar;
	}
	
	public Exemplar getExemplar() {
		return exemplar;
	}

	public void setStatus(boolean status) {
		this.status= status;
	}

	public boolean getStatus() {
		return status;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public Date getDataDevolucaoPrevista() {
		return dataDevolucaoPrevista;
	}
}
