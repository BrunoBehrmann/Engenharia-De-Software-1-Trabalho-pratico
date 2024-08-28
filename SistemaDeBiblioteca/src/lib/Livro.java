package lib;

import java.util.List;

public class Livro extends Sujeito {
	private int codigo;
	private String titulo;
	private String editora;
	private String autores;
	private String edicao;
	private int anoPub;
	private int qtdExemplar;
	private int qntReservas;
	private List<Exemplar> exemplares;
	private List<Reserva> reservas;
	private List<Observador> observadores;
	// quantidade de vezes livro
	
	public Livro(int codigo, String titulo, String editora, String autores, String edicao, int anoPub) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.editora = editora;
		this.autores = autores;
		this.edicao = edicao;
		this.anoPub = anoPub;
	}
	
	public int getQntReservas() {
		return this.reservas.size();
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getAnoPub() {
		return anoPub;
	}

	public void setAnoPub(int anoPub) {
		this.anoPub = anoPub;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public void adicionarReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public List<Observador> getObservadores() {
		return observadores;
	}

	public void adicionarObservadores(Observador observador) {
		observadores.add(observador);
	}
}
