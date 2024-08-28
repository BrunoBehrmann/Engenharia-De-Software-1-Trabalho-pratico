package lib;

import java.util.ArrayList;
import java.util.List;

import lib.command.strategy.ITipoEmprestimo;

public abstract class Usuario implements IUsuario {
	
    private int idUsuario;
    private String nome;
    private int qntReservas;
    private boolean ehDevedor;
    private List<Reserva> reservas;
    private List<Emprestimo> emprestimos;

    // Construtor, getters e setters
    
    Usuario(int idUsuario, String nome) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.reservas = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }
    
    public abstract ITipoEmprestimo getTipoEmprestimo();

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

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	
}
