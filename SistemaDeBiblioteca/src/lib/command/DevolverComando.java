package lib.command;

import lib.Livro;
import lib.ParametrosEntrada;
import lib.Repositorio;

public class DevolverComando implements Comando {

	@Override
	public void executar(ParametrosEntrada parametros) {
		int codigoLivro = parametros.getCodigo2();
		Repositorio repositorio = Repositorio.getInstancia();
		Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);
		
		repositorio.adicionarLivro(livro);
		// +?
	}

}
