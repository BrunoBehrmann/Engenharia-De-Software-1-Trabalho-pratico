package lib;

public class ConsultarLivroComando implements Comando {
	
	@Override
	public void executar(ParametrosEntrada parametros) {
		 String codigoLivro = parametros.getCodigo1();
		 Repositorio repositorio = Repositorio.getInstancia();
		 Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);
	}
	
}
