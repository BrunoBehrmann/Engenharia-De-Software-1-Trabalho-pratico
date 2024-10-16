package lib;

import lib.users.Usuario;

public class Exemplar {
	
	private Livro livro;
	private int codigoExemplar;
	private boolean disponivel;
	private Usuario usuarioPortador;
	private Emprestimo emprestimo;
	
	public Exemplar(Livro livro, int codigoExemplar, boolean disponivel) {
        this.livro = livro;
        this.codigoExemplar = codigoExemplar;
        this.disponivel = disponivel;
    }
	
	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void setDisponivel(boolean disponibilidade) {
		this.disponivel = disponibilidade;
	}
	
	public int getCodigoExemplar() {
		return codigoExemplar;
	}
	
	public void setCodigoExemplar(int codigoExemplar) {
		this.codigoExemplar = codigoExemplar;
	}

	public Livro getLivro() {
		return livro;
	}

	public Usuario getUsuarioPortador() {
		return usuarioPortador;
	}

	public void setUsuarioPortador(Usuario usuarioPortador) {
		this.usuarioPortador = usuarioPortador;
	}

	public Emprestimo getEmprestimo() {
		return this.emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
		this.disponivel = false;
	}
	
	public String getStatusDisponivel() {
		if (isDisponivel()) {
			return "disponivel";
		} else {
			return "emprestado";
		}
		
	}
	
}
