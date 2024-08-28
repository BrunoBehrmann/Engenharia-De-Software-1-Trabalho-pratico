package lib;

import java.util.Date;

public class Reserva{
	private Livro livro;
	private Usuario usuario;
	private Date dataDevolucao;
	
	public Reserva (Livro livro, Usuario usuario, Date dataDevolucao) {
		this.livro = livro;
		this.usuario = usuario;
		this.dataDevolucao = dataDevolucao;
	}


}
