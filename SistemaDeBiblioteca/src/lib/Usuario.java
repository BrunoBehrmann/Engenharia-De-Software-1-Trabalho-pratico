package lib;

import java.util.List;

public class Usuario {
	
	private int idUsuario;
	private int qntReservas;
	private String nome;
	private boolean ehDevedor;
	private List<Reserva> reservas;
	
	Usuario (int idUsuario, String nome) {
		this.idUsuario = idUsuario;
		this.nome = nome;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public int getQntReservas() {
		return reservas.size();
	}


	
}
