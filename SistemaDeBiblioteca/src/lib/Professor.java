package lib;

import java.util.List;

import lib.command.strategy.ITipoEmprestimo;

public class Professor extends Usuario implements Observador {

	private int qntDiasEmprestimos = 7;
	
	Professor(int idUsuario, String nome) {
	}

	@Override
	public void atualizar(Sujeito sujeito) {
		int qntReservas = ((Livro) sujeito).getQntReservas();
	    System.out.println("Quantidade de Reservas: " + qntReservas);
	}

	@Override
	public ITipoEmprestimo getTipoEmprestimo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}