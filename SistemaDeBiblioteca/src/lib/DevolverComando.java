package lib;

public class DevolverComando implements Comando {

	@Override
	public void executar(ParametrosEntrada parametros) {
		int codigoLivro = parametros.getCodigo1();
		Repositorio repositorio = Repositorio.getInstancia();
		Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);
		
		
	}

}
