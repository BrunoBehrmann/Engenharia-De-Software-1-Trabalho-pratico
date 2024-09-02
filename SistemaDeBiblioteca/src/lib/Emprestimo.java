package lib;

import java.time.LocalDateTime;
import java.util.Date;

import lib.users.IUsuario;

public class Emprestimo {
	private IUsuario usuario;
	private Exemplar exemplar;
	private LocalDateTime dataEmprestimo;
	private LocalDateTime dataDevolucaoPrevista;
	
	public Emprestimo(IUsuario usuario, Exemplar exemplar, LocalDateTime dataEmprestimo, int tempoDeEmprestimo) {
		this.setUsuario(usuario);
		this.exemplar = exemplar;
		this.setDataEmprestimo(dataEmprestimo);
		this.setDataDevolucaoPrevista(dataEmprestimo.plusDays(tempoDeEmprestimo));
	}
	
	public Exemplar getExemplar() {
		return exemplar;
	}

	public LocalDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDateTime getDataDevolucaoPrevista() {
		return dataDevolucaoPrevista;
	}

	public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista) {
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}

	public IUsuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(IUsuario usuario) {
		this.usuario = usuario;
	}
	
}
