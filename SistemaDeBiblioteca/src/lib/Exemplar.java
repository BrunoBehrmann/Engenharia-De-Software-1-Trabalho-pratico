package lib;

public class Exemplar extends Livro{
	
	private int codigoExemplar;
	private boolean disponibilidade;
	private Usuario usuarioPortador;
	
	// construtor
	public Exemplar(int codigo, String titulo, String editora, String autores, String edicao, int anoPub, int codigoExemplar, boolean disponibilidade) {
		super(codigo, titulo, editora, autores, edicao, anoPub);
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
