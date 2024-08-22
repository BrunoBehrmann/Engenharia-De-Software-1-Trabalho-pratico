package lib;

import java.util.HashMap;
import java.util.List;

import lib.command.Comando;
import lib.command.ConsultarLivroComando;
import lib.command.DevolverComando;
import lib.command.EmprestarComando;
import lib.command.ReservarLivroComando;

public class Sistema {

	private HashMap<String, Comando> comandos = new HashMap<String, Comando>();
	private List<Reserva> registros;

	public Sistema() {
		this.initComandos();
		BancoDeDados banco = new BancoDeDados();
		banco.carregaDados();
	}

	private void initComandos() {
		comandos.put("emp", new EmprestarComando());
		comandos.put("dev", new DevolverComando());
		comandos.put("res", new ReservarLivroComando());
		//comandos.put("obs", new RegistrarProfessorObservadorComando());
		comandos.put("liv", new ConsultarLivroComando());
		//comandos.put("usu", new ListarReservasComando());
		//comandos.put("ntf", new ConsultarVezesNotificaoReservaComando());
		comandos.put("sai", new SairComando());
	}

	public void executarComando(String comandoString, ParametrosEntrada parametros) {
		// enxerga a string passada como comando
		Comando comando = this.comandos.get(comandoString);
		comando.executar(parametros);
	}
}
