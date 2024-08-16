package lib;

import java.util.List;

public class Aluno extends Usuario {
	//verificar pois usuario ja tem uma lista de exemplares.
	private List<Livro> emprestimos;
	private int qntEmprestimos;
	
	public Aluno(int id, String nome) {
		this.setId(id);
		this.setNome(nome);
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
