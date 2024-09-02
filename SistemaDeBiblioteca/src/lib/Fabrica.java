package lib;

import java.time.LocalDateTime;

import lib.command.Comando;
import lib.command.ConsultarLivroComando;
import lib.command.ConsultarUsuarioComando;
import lib.command.ConsultarVezesNotificaoReservaComando;
import lib.command.DevolverComando;
import lib.command.EmprestarComando;
import lib.command.RegistrarProfessorObservadorComando;
import lib.command.ReservarLivroComando;
import lib.command.SairComando;
import lib.users.IUsuario;
import lib.users.Usuario;

public class Fabrica {
	public static Emprestimo criarEmprestimo(IUsuario usuario, Exemplar exemplar, LocalDateTime LocalDateTime, int dias) {
		return new Emprestimo(usuario, exemplar, LocalDateTime, dias);
	}
	
	public static Comando criarConsultarLivroComando() {
		return new ConsultarLivroComando();
	}

	public static Comando criarConsultarUsuarioComando() {
		return new ConsultarUsuarioComando();
	}

	public static Comando criarConsultarVezesNotificaoReservaComando() {
		return new ConsultarVezesNotificaoReservaComando();
	}

	public static Comando criarDevolverComando() {
		return new DevolverComando();
	}

	public static Comando criarEmprestarComando() {
		return new EmprestarComando();
	}

	public static Comando criarRegistrarProfessorObservadorComando() {
		return new RegistrarProfessorObservadorComando();
	}

	public static Comando criarReservarLivroComando() {
		return new ReservarLivroComando();
	}

	public static Comando criarSairComando() {
		return new SairComando();
	}
}
