package lib;

import java.util.List;

public class Professor extends Usuario implements Observador {

	private int qntDiasEmprestimos = 7;
	
	Professor(int idUsuario, String nome) {
		super(idUsuario, nome);
	}

	@Override
	public void atualizar(Sujeito sujeito) {
		int qntReservas = ((Livro) sujeito).getQntReservas();
	    // System.out.println("Quantidade de Reservas: " + qntReservas);
	}
	
	public boolean ehObservador (Livro livro) {
		if (livro.getObservadores().contains(this)) {
			return true;
		}
		return false;
	}
}