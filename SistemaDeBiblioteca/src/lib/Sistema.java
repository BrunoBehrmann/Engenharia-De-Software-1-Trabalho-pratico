package lib;

import java.util.HashMap;
import java.util.List;

import lib.command.Comando;
import lib.command.ConsultarLivroComando;
import lib.command.DevolverComando;
import lib.command.EmprestarComando;
import lib.command.RegistrarProfessorObservadorComando;
import lib.command.ReservarLivroComando;
import lib.command.SairComando;

public class Sistema {

	private HashMap<String, Comando> comandos = new HashMap<String, Comando>();
	private List<Reserva> registros;

	public Sistema() {
		this.initComandos();
		BancoDeDados banco = new BancoDeDados();
		banco.carregaDados();
	}

	private void initComandos() {
		comandos.put("emp", new EmprestarComando());  // falta
		comandos.put("dev", new DevolverComando()); // ok!
		comandos.put("res", new ReservarLivroComando()); // ok!
		comandos.put("obs", new RegistrarProfessorObservadorComando()); // implementar logica
		comandos.put("liv", new ConsultarLivroComando()); // ok
		comandos.put("usu", new ConsultarUsuarioComando()); // ok!
		comandos.put("ntf", new ConsultarVezesNotificaoReservaComando()); // falta
		comandos.put("sai", new SairComando()); // ok!
	}

	public void executarComando(String comandoString, ParametrosEntrada parametros) {
		// enxerga a string passada como comando
		Comando comando = this.comandos.get(comandoString);
		comando.executar(parametros);
	}
}
