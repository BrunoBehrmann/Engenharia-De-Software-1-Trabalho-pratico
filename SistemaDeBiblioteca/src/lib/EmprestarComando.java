package lib;

public class EmprestarComando implements Comando {
	
	public void executar(ParametrosEntrada parametros) {
		String codigoUsuario = parametros.getCodigo1();
		Reposistorio repositorio = repositorio.getInstancia();
		Repositorio
		Usuario usuario = repositorio.buscaUsuarioPorCodigo(CodigoUsuario);
		Livro livro
	}
}
