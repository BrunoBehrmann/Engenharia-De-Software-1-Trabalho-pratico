package lib;

public class Exemplar {
	
	private Livro livro;
	private int codigoExemplar;
	private boolean disponibilidade;
	private Usuario usuarioPortador;
	private Emprestimo emprestimo;
	
	// construtor
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
	
}
