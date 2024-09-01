package lib.users;

import lib.Livro;
import lib.command.strategy.EmprestimoAlunoGraduacao;
import lib.command.strategy.ITipoEmprestimo;

public class AlunoGraduacao extends Usuario implements IAluno {
	
	private int qntEmprestimos = 0;
	private int qntDiasEmprestimos = 0;
	
	private int qntMAXIMAEmprestimos = 3;
	private int qntMAXIMADiasEmprestimos = 3;
	
	public AlunoGraduacao(int idUsuario, String nome) {
		super(idUsuario, nome);
	}
	
	@Override
	public ITipoEmprestimo getTipoEmprestimo() {
		return new EmprestimoAlunoGraduacao();
	}
	
	@Override
	public boolean temEmprestimoLivro(Livro livroVerificar) {
		if (getEmprestimos().contains(livroVerificar))
			return true;
			else
				return false;
	}
	
	@Override
	public boolean podeFazerEmprestimo() {
		if (qntEmprestimos < qntMAXIMAEmprestimos) {
			return true;
		}
		return false;
	}
	
	public int getQntEmprestimos() {
		return qntEmprestimos;
	}

	public void setQntEmprestimos(int qntEmprestimos) {
		this.qntEmprestimos = qntEmprestimos;
	}

	public int getQntDiasEmprestimos() {
		return qntDiasEmprestimos;
	}

	public void setQntDiasEmprestimos(int qntDiasEmprestimos) {
		this.qntDiasEmprestimos = qntDiasEmprestimos;
	}

	
}
