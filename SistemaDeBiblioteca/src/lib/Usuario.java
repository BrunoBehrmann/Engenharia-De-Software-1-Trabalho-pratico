package lib;

import java.util.List;

import lib.command.strategy.ITipoEmprestimo;

public abstract class Usuario {
	
    private int idUsuario;
    private String nome;
    private int qntReservas;
    private boolean ehDevedor;
    private List<Reserva> reservas;

    // Construtor, getters e setters

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

    public int getQntReservas() {
        return qntReservas;
    }

    public void setQntReservas(int qntReservas) {
        this.qntReservas = qntReservas;
    }

    public boolean isEhDevedor() {
        return ehDevedor;
    }

    public void setEhDevedor(boolean ehDevedor) {
        this.ehDevedor = ehDevedor;
    }
	
}
