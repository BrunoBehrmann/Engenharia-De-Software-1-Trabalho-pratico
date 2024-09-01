package lib.users;

import java.util.ArrayList;
import java.util.List;

import lib.Emprestimo;
import lib.Livro;
import lib.Reserva;
import lib.command.strategy.ITipoEmprestimo;

public abstract class Usuario implements IUsuario {
	
    private int idUsuario;
    private String nome;
    private int qntReservas;
    private boolean devedor;
    private List<Reserva> reservas;
    private List<Emprestimo> emprestimos;
    
    Usuario(int idUsuario, String nome) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.reservas = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
        
        this.qntReservas = 0;
    }
    
    public abstract ITipoEmprestimo getTipoEmprestimo();

    public boolean temReservaLivro(Livro livro) {
    	for (Reserva reserva: this.reservas) {
    		if (reserva.getLivro().equals(livro)) {
    			return true;
    		}
    	}
    	return false;
    }
    
	
	public void adicionarReserva(Reserva reserva) {
		this.reservas.add(reserva);
		this.qntReservas += 1;
		reserva.getLivro().setQntReservas(reserva.getLivro().getQntReservas() + 1);
	}
    
    public void removerReserva(Livro livro) {
		for (Reserva reserva: this.reservas) {
    		if (reserva.getLivro().equals(livro)) {
    			this.reservas.remove(reserva);
    			this.qntReservas -= 1;
    			reserva.getLivro().setQntReservas(reserva.getLivro().getQntReservas() - 1);
    			break;
    		}
    	}
		
	}
	
	public void adicionarEmprestimo(Emprestimo emprestimo) {
		this.emprestimos.add(emprestimo);
	}
	
	public boolean temEmprestimoLivro(Livro livro) {
    	for (Emprestimo emprestimo: this.emprestimos) {
    		if (emprestimo.getExemplar().equals(livro.buscaExemplar())) {
    			return true;
    		}
    	}
    	return false;
    }
	
	public void removerEmprestimo(Livro livro) {
		for (Emprestimo emprestimo: this.emprestimos) {
    		if (emprestimo.getExemplar().equals(livro.buscaExemplar())) {
    			this.emprestimos.remove(emprestimo);
    			break;
    		}
    	}
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

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public boolean isDevedor() {
		return devedor;
	}

	public void setDevedor(boolean devedor) {
		this.devedor = devedor;
	}
	
	public int getQntReservas() {
        return reservas.size();
    }

	public void setQntReservas(int qntReservas) {
		this.qntReservas = qntReservas;
	}
	
}
