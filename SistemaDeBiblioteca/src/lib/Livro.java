package lib;

import java.util.ArrayList;
import java.util.List;

public class Livro implements Sujeito {
	private int codigo;
	private String titulo;
	private String editora;
	private String autores;
	private String edicao;
	private int anoPub;
	private int qntExemplaresDisponiveis;
	private int qntReservas; // lembrar uso
	private int qntNotificacaoObs;
	private List<Exemplar> exemplares;
	private List<Reserva> reservas; // o livro precisa de uma lista de reservas?
	private List<Observador> observadores;
	// quantidade de vezes livro
	
	public Livro(int codigo, String titulo, String editora, String autores, String edicao, int anoPub) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.editora = editora;
		this.autores = autores;
		this.edicao = edicao;
		this.anoPub = anoPub;
		
		this.qntExemplaresDisponiveis = 0;
		this.qntReservas = 0;
		this.qntNotificacaoObs = 0;
		
		this.exemplares = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.observadores = new ArrayList<>();
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
	
	@Override
	public void adicionarObservador(Observador o) {
		observadores.add(o);
	}
	
	@Override
	public void removerObservador(Observador o) {
		int i = observadores.indexOf(o);
		if (i >= 0) {
			observadores.remove(i);
		}
	}
	
	@Override
	public void notificarObservadores() {
		for (int i = 0; i < observadores.size(); i++) {
			Observador observador = observadores.get(i);
			observador.atualizar(this);
		}
	}

	public int getQntNotificacaoObs() {
		return qntNotificacaoObs;
	}

	public void setQntNotificacaoObs(int qntNotificacaoObs) {
		this.qntNotificacaoObs = qntNotificacaoObs;
		notificarObservadores();
	}
	
	public int getQntExemplaresDisponiveis() {
		return qntExemplaresDisponiveis;
	}

	public void setQntExemplaresDisponiveis(int qntExemplaresDisponiveis) {
		this.qntExemplaresDisponiveis = qntExemplaresDisponiveis;
	}

	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(List<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	
	public void adicionarExemplar(Exemplar exemplar) {
		this.exemplares.add(exemplar);
		this.qntExemplaresDisponiveis += 1;
	}
	
	public void removerExemplar(Exemplar exemplar) {
		this.exemplares.remove(exemplar);
		this.qntExemplaresDisponiveis -= 1;
	}
	
	public Exemplar buscaExemplar() {
		for(Exemplar exemplar: this.exemplares) {
			if(exemplar.getLivro().equals(this)) {
				return exemplar;
			}
		}
		return null;
	}

}
