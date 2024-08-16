package lib;

import java.util.List;

public class Aluno extends Usuario {
	private List<Exemplar> emprestimos;
	private int qntEmprestimos;
	
	
	public boolean temEmprestimo(Exemplar exemplarVerificar) {
		for (Exemplar exemplarQPossui: this.emprestimos) {
			return exemplarQPossui. == exemplarVerificar;
		}
		return false;
	}
}
