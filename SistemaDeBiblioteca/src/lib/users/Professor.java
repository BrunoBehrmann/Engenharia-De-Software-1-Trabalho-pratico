package lib.users;

import lib.Livro;
import lib.Observador;
import lib.Sujeito;
import lib.command.strategy.EmprestimoProfessor;
import lib.command.strategy.ITipoEmprestimo;

public class Professor extends Usuario implements IProfessor, Observador {

	private int qntDiasEmprestimo = 7;
	private int contadorNotificacoes;
	
	public Professor(int idUsuario, String nome) {
		super(idUsuario, nome);
	}
	
	@Override
	public int getQntDiasEmprestimo() {
		return this.getQntDiasEmprestimo();
	}

	@Override
	public void setQntDiasEmprestimo(int qntDiasEmprestimo) {
		this.qntDiasEmprestimo = qntDiasEmprestimo;
	}
	
	@Override
	public void atualizar(Sujeito sujeito) {
		int qntReservas = ((Livro) sujeito).getQntReservas();
	    System.out.println("Quantidade de Reservas: " + qntReservas);
	}

	@Override
	public ITipoEmprestimo getTipoEmprestimo() {
		return new EmprestimoProfessor();
	}
	
	public boolean ehObservador (Livro livro) {
		if (livro.getObservadores().contains(this)) {
			return true;
		}
		return false;
	}

	public int getContadorNotificacoes() {
		return contadorNotificacoes;
	}
	
}