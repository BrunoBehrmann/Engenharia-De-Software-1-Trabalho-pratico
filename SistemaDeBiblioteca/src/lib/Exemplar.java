package lib;

public class Exemplar {
	
	private Livro livro;
	private int codigoExemplar;
	private boolean disponibilidade;
	private Usuario usuarioPortador;
	private Emprestimo emprestimo;
	
	public Exemplar(Livro livro, int codigoExemplar, boolean disponibilidade) {
        this.livro = livro;
        this.codigoExemplar = codigoExemplar;
        this.disponibilidade = disponibilidade;
    }
	
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
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
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
	
}
