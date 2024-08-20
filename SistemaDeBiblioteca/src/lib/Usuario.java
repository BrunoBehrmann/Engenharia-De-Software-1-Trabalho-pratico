package lib;

import java.util.List;

public class Usuario {
	
	private int id;
	private int qntReservas;
	private String nome;
	private boolean ehDevedor;
	private List<Exemplar> exemplares;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQntReservas() {
		return qntReservas;
	}

	public void setQntReservas(int qntReservas) {
		this.qntReservas = qntReservas;
	}
	
}
