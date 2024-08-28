package lib;

import java.util.List;

import lib.command.strategy.EmprestimoAlunoPosGraduacao;
import lib.command.strategy.ITipoEmprestimo;

public class AlunoPosGraduacao extends Usuario implements IAluno {

	private int qntEmprestimos = 4;
	private int qntDiasEmprestimos = 5;
	
	AlunoPosGraduacao(int idUsuario, String nome) {
		super(idUsuario, nome);
	}

	@Override
	public boolean temEmprestimo(Livro livroVerificar) {
		if (getEmprestimos().contains(livroVerificar))
			return true;
			else
				return false;
	}

	@Override
	public ITipoEmprestimo getTipoEmprestimo() {
		return new EmprestimoAlunoPosGraduacao();
	}

	

}
