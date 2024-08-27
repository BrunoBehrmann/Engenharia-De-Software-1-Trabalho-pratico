package lib;

import java.util.List;

public class AlunoGraduacao extends Aluno {
	
	private int qntEmprestimos = 3;
	private int qntDiasEmprestimos = 3;

	AlunoGraduacao(int idUsuario, String nome) {
		super(idUsuario, nome);
	}

}
