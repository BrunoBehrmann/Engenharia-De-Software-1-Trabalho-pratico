package lib.command;

import lib.Livro;
import lib.ParametrosEntrada;
import lib.Repositorio;
import lib.Usuario;
import lib.command.strategy.ITipoEmprestimo;

public class EmprestarComando implements Comando {
	
	private ITipoEmprestimo tipoEmprestimo;
	
	@Override
	public void executar(ParametrosEntrada parametros) {
		int codigoUsuario = parametros.getCodigo1();
		int codigoLivro = parametros.getCodigo2();
		Repositorio repositorio = Repositorio.getInstancia();
		Usuario usuario = repositorio.buscaUsuarioPorCodigo(codigoUsuario);
		Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);
		
		
		
		
		
		
		// implementar aqui emprestar
		
		
		
		// verifica se o aluno tem reserva feita para o livro
		try {
			tipoEmprestimo.emprestar(usuario, livro);
		} catch {
			System.out.println("O usuario " + usuario.getNome() + " não tem uma reserva para o livro " + livro.getTitulo() + ".");
		}
			
		
		// se o usuario tiver reserva, excluir aquela reserva e fazer o emprestimo
		// mais coisas para fazer 

		// verificação do strategy
		
	}
	
	private void setTimpoEmprestimo(ITipoEmprestimo NovoTipoEmprestimo) {
		this.tipoEmprestimo = NovoTipoEmprestimo;
	}
	
}
