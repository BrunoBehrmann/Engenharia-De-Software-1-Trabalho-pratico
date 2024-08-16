package lib;

public class ConsultarLivroComando implements Comando {
	public void executar(ParametrosEntrada parametros) {
		 String codigolivro = parametros.getCodigo1();
		 Repositorio repositorio = Repositorio.getInstancia();
		 Livro livro = repositorio.buscalivroporcodigo(codigolivro);
	}
}
