package lib.command;

import lib.IUsuario;
import lib.Livro;
import lib.ParametrosEntrada;
//import lib.Professor;
import lib.Repositorio;
import lib.Reserva;
import lib.Usuario;

public class ReservarLivroComando implements Comando {

	@Override
	public void executar(ParametrosEntrada parametros) {
		int codigoLivro = parametros.getCodigo2();
		Repositorio repositorio = Repositorio.getInstancia();
		Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);

		int codigoUsuario = parametros.getCodigo1();
		IUsuario usuario = repositorio.buscaUsuarioPorCodigo(codigoUsuario);

		Reserva reserva = new Reserva(livro, usuario, null); //adicionar sistema de data e hora

		livro.adicionarReserva(reserva);
		//usuario.
	}

}
