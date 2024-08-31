package lib;

import java.util.List;

import lib.command.strategy.EmprestimoAlunoPosGraduacao;
import lib.command.strategy.ITipoEmprestimo;

public class AlunoPosGraduacao extends Usuario implements IAluno {
	
	private int qntEmprestimos = 0;
	private int qntDiasEmprestimos = 0;
	
	private int qntMAXIMAEmprestimos = 4;
	private int qntMAXIMADiasEmprestimos = 5;
	
	AlunoPosGraduacao(int idUsuario, String nome) {
		super(idUsuario, nome);
	}

	@Override
	public boolean temEmprestimoLivro(Livro livroVerificar) {
		if (getEmprestimos().contains(livroVerificar))
			return true;
			else
				return false;
	}
	
	@Override
	public boolean temReservaLivro(Livro livroVerificar) {
		if (getReservas().contains(livroVerificar))
			return true;
			else
				return false;
	}
	
	@Override
	public ITipoEmprestimo getTipoEmprestimo() {
		return new EmprestimoAlunoPosGraduacao();
	}

	@Override
	public boolean podeFazerEmprestimo() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
