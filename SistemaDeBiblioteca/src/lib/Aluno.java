package lib;

import java.util.List;

import lib.command.strategy.ITipoEmprestimo;

public class Aluno extends Usuario {

	private List<Livro> emprestimos;
	
	Aluno(int idUsuario, String nome) {
	}
	
	public boolean temEmprestimo(Livro livroVerificar) {
		for (Livro livroQPossui: this.emprestimos) {
			return livroQPossui.getTitulo().equals(livroVerificar.getTitulo());
		}
		return false;
	}

	@Override
	public ITipoEmprestimo getTipoEmprestimo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
