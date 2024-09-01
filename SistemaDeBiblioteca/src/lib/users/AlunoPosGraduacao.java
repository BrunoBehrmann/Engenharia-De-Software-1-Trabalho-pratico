package lib.users;

import lib.Livro;
import lib.command.strategy.EmprestimoAlunoPosGraduacao;
import lib.command.strategy.ITipoEmprestimo;

public class AlunoPosGraduacao extends Usuario implements IAluno {
	
	private int qntEmprestimos = 0;
	private int qntDiasEmprestimos = 0;
	
	private int qntMAXIMAEmprestimos = 4;
	private int qntMAXIMADiasEmprestimos = 5;
	
	public AlunoPosGraduacao(int idUsuario, String nome) {
		super(idUsuario, nome);
	}
	
	@Override
	public ITipoEmprestimo getTipoEmprestimo() {
		return new EmprestimoAlunoPosGraduacao();
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
