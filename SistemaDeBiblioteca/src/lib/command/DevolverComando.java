package lib.command;

import lib.Livro;
import lib.Repositorio;
import lib.console.ParametrosEntrada;
import lib.users.IUsuario;

public class DevolverComando implements Comando {

	@Override
	public void executar(ParametrosEntrada parametros) {
		int codigoUsuario = parametros.getCodigo1();
		int codigoLivro = parametros.getCodigo2();
		Repositorio repositorio = Repositorio.getInstancia();
		IUsuario usuario = repositorio.buscaUsuarioPorCodigo(codigoUsuario);
		Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);
		
		if (usuario.temEmprestimoLivro(livro)) {
			usuario.removerEmprestimo(livro);
			repositorio.adicionarLivro(livro);
			System.out.println("Sucesso! O usuario " + usuario.getNome() + " devolveu o livro " + livro.getTitulo() + ".");
		} else {
			System.out.println("O usuario " + usuario.getNome() + " não possui emprestimo em aberto para o livro " + livro.getTitulo() + ".");
		}
	}

}
