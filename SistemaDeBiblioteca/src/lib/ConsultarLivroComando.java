package lib;

public class ConsultarLivroComando implements Comando {
	
	@Override
	public void executar(ParametrosEntrada parametros) {
		 int codigoLivro = parametros.getCodigo1();
		 Repositorio repositorio = Repositorio.getInstancia();
		 Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);
		 
		 String titulo = livro.getTitulo();
		 System.out.println("Titulo do livro: " + titulo);
	}
	
}
