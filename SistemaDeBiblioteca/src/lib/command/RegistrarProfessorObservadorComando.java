package lib.command;

import lib.Livro;
import lib.ParametrosEntrada;
import lib.Repositorio;
//import lib.command.Comando;
import lib.users.Professor;

public class RegistrarProfessorObservadorComando implements Comando {

	@Override
	public void executar(ParametrosEntrada parametros) {
		int codigoLivro = parametros.getCodigo2();
		Repositorio repositorio = Repositorio.getInstancia();
		Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);

		int codigoUsuario = parametros.getCodigo1();
		Professor professor = (Professor) repositorio.buscaUsuarioPorCodigo(codigoUsuario);
		
		// logica 2 livros em algum lugar
		livro.adicionarObservador(professor);

	}

}
