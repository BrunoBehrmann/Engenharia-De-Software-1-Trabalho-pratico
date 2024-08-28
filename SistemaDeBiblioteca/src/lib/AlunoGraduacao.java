package lib;

import lib.command.strategy.EmprestimoAlunoGraduacao;
import lib.command.strategy.ITipoEmprestimo;

public class AlunoGraduacao extends Usuario implements IAluno {
	
	private int qntEmprestimos = 3;
	private int qntDiasEmprestimos = 3;
	
	AlunoGraduacao(int idUsuario, String nome) {
		super(idUsuario, nome);
	}
	
	@Override
	public ITipoEmprestimo getTipoEmprestimo() {
		return new EmprestimoAlunoGraduacao();
	}
	
	@Override
	public boolean temEmprestimo(Livro livroVerificar) {
		if (getEmprestimos().contains(livroVerificar))
			return true;
			else
				return false;
	}
}
