package lib.command;

import lib.Livro;
import lib.ParametrosEntrada;
import lib.Repositorio;
import lib.Usuario;

public class EmprestarComando implements Comando {
	
	@Override
	public void executar(ParametrosEntrada parametros) {
		int codigoUsuario = parametros.getCodigo1();
		int codigoLivro = parametros.getCodigo2();
		Repositorio repositorio = Repositorio.getInstancia();
		Usuario usuario = repositorio.buscaUsuarioPorCodigo(codigoUsuario);
		Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);
		
		//usuario.ad
		// implementar aqui emprestar
	}
}
