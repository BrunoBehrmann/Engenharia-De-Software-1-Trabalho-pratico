package lib;

import java.time.LocalDateTime;

import lib.users.IUsuario;

public class Emprestimo {
	private IUsuario usuario;
	private Exemplar exemplar;
	private LocalDateTime dataEmprestimo;
	private LocalDateTime dataDevolucaoPrevista;
	private boolean concluido;
	
	public Emprestimo(IUsuario usuario, Exemplar exemplar, LocalDateTime dataEmprestimo, int tempoDeEmprestimo) {
		this.setUsuario(usuario);
		this.exemplar = exemplar;
		this.setDataEmprestimo(dataEmprestimo);
		this.setDataDevolucaoPrevista(dataEmprestimo.plusDays(tempoDeEmprestimo));
		
		this.setConcluido(false);
	}
	
	public Exemplar getExemplar() {
		return this.exemplar;
	}

	public LocalDateTime getDataEmprestimo() {
		return this.dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDateTime getDataDevolucaoPrevista() {
		return this.dataDevolucaoPrevista;
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

	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}
	
}
