package lib.users;

import lib.Livro;

public interface IAluno {
	public boolean temEmprestimoLivro(Livro livroVerificar);
	public boolean podeFazerEmprestimo();
}
