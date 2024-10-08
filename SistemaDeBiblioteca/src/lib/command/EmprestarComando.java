package lib.command;

import lib.Livro;
import lib.Repositorio;
import lib.command.strategy.ITipoEmprestimo;
import lib.console.ParametrosEntrada;
import lib.users.IUsuario;

public class EmprestarComando implements Comando {
	
	private ITipoEmprestimo tipoEmprestimo;
	
	@Override
	public void executar(ParametrosEntrada parametros) {
		int codigoUsuario = parametros.getCodigo1();
		int codigoLivro = parametros.getCodigo2();
		Repositorio repositorio = Repositorio.getInstancia();
		IUsuario usuario = repositorio.buscaUsuarioPorCodigo(codigoUsuario);
		Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);

    	// Inicializa tipoEmprestimo com base no usuário
        this.tipoEmprestimo = usuario.getTipoEmprestimo();
        this.tipoEmprestimo.emprestar(usuario, livro);
        
	}

}
