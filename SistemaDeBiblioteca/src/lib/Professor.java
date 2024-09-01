package lib;

import lib.command.strategy.EmprestimoProfessor;
import lib.command.strategy.ITipoEmprestimo;

public class Professor extends Usuario implements Observador, IProfessor {

	private int qntDiasEmprestimos = 7;
	// contador notificacoes
	
	Professor(int idUsuario, String nome) {
		super(idUsuario, nome);
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
	
	
}