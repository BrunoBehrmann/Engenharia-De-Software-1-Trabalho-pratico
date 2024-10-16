package lib;

import java.time.LocalDateTime;

import lib.users.IUsuario;

public class Reserva{
	private Livro livro;
	private IUsuario usuario;
	private LocalDateTime dataDevolucao;
	
	public Reserva (Livro livro, IUsuario usuario, LocalDateTime localDateTime) {
		this.setLivro(livro);
		this.setUsuario(usuario);
		this.dataDevolucao = localDateTime;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public IUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(IUsuario usuario) {
		this.usuario = usuario;
	}

	//public void setDataDevolucao()

	public LocalDateTime getDataDevolucao() {
		return dataDevolucao;
	}
}
