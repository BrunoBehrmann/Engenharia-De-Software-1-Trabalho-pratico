package lib;

import java.util.ArrayList;
import java.util.List;

import lib.observer.Observador;
import lib.observer.Sujeito;

public class Livro implements ILivro, Sujeito {
	private int codigo;
	private String titulo;
	private String editora;
	private String autores;
	private String edicao;
	private int anoPub;
	private int qntExemplaresDisponiveis;
	private int qntReservas;
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
		this.setQntReservas(0);
		this.qntNotificacaoObs = 0;
		
		this.exemplares = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.observadores = new ArrayList<>();
	}
	
	@Override
	public int getCodigoBiblioteca() {
		return codigo;
	}
	
	@Override
	public void setCodigoBiblioteca(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String getTitulo() {
		return titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String getEditora() {
		return editora;
	}

	@Override
	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String getAutores() {
		return autores;
	}

	@Override
	public void setAutores(String autores) {
		this.autores = autores;
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
	
	public void removerReserva(Livro livro) {
		for (Reserva reserva: this.reservas) {
    		if (reserva.getLivro().equals(livro)) {
    			this.reservas.remove(reserva);
    			this.qntReservas -= 1;
    			break;
    		}
    	}
		
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
		setQntReservas(this.qntReservas += 1);
	}
	
	public List<Observador> getObservadores() {
		return observadores;
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

	public int getQntReservas() {
		return qntReservas;
	}

	public void setQntReservas(int qntReservas) {
		this.qntReservas = qntReservas;
	}
}
