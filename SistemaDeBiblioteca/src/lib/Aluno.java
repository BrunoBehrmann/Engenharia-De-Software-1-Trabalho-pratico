package lib;

import java.util.List;

public class Aluno extends Usuario {

	private List<Livro> emprestimos;
	
	Aluno(int idUsuario, String nome) {
		super(idUsuario, nome);
		
	}
	
	public boolean temEmprestimo(Livro livroVerificar) {
		for (Livro livroQPossui: this.emprestimos) {
			return livroQPossui.getTitulo().equals(livroVerificar.getTitulo());
		}
		return false;
	}
	
	public void addEmprestimo(Livro livro) {
		this.emprestimos.add(livro);
	}
	
}
