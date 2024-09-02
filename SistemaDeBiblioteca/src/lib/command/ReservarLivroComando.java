package lib.command;

import java.time.LocalDateTime;

import lib.Livro;
import lib.Repositorio;
import lib.Reserva;
import lib.console.ParametrosEntrada;
import lib.users.IUsuario;
import lib.users.Usuario;

public class ReservarLivroComando implements Comando {

	@Override
	public void executar(ParametrosEntrada parametros) {
		int codigoLivro = parametros.getCodigo2();
		Repositorio repositorio = Repositorio.getInstancia();
		Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);

		int codigoUsuario = parametros.getCodigo1();
		IUsuario usuario = repositorio.buscaUsuarioPorCodigo(codigoUsuario);
		
		if (usuario.getQntReservas() < 3) {
			if (!usuario.temReservaLivro(livro)) {
				Reserva reserva = new Reserva(livro, usuario, LocalDateTime.now());
				livro.adicionarReserva(reserva);
				usuario.adicionarReserva(reserva);
				System.out.println("Sucesso! O usuario " + usuario.getNome() + " reservou o livro " + livro.getTitulo() + ".");
			} else {
				System.out.println("O usuario " + usuario.getNome() + " ja possui uma reserva para o livro " + livro.getTitulo() + ".");
			}
			
		} else {
			System.out.println("Não foi possível reservar o livro " + livro.getTitulo() +". O usuario " + usuario.getNome() + " já possui o limite de 3 reservas.");
		}
	}

}
