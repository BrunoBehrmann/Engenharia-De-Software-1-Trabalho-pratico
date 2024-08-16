package lib;

public class EmprestarComando implements Comando {
	
	@Override
	public void executar(ParametrosEntrada parametros) {
		String codigoUsuario = parametros.getCodigo1();
		String codigoLivro = parametros.getCodigo2();
		Repositorio repositorio = Repositorio.getInstancia();
		Repositorio rep = Repositorio.getInstancia();
		Usuario usuario = repositorio.buscaUsuarioPorCodigo(codigoUsuario);
		Livro livro = rep.buscaLivroPorCodigo(codigoLivro);
		
		
		//
	}
}
