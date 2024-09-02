package lib.console;

import java.util.HashMap;
import java.util.List;

import lib.BancoDeDados;
import lib.Reserva;
import lib.command.Comando;
import lib.command.ConsultarLivroComando;
import lib.command.ConsultarUsuarioComando;
import lib.command.ConsultarVezesNotificaoReservaComando;
import lib.command.DevolverComando;
import lib.command.EmprestarComando;
import lib.command.RegistrarProfessorObservadorComando;
import lib.command.ReservarLivroComando;
import lib.command.SairComando;
import lib.Fabrica;

public class Sistema {

	private HashMap<String, Comando> comandos = new HashMap<String, Comando>();
	private List<Reserva> registros;

	public Sistema() {
		this.initComandos();
		BancoDeDados banco = new BancoDeDados();
		banco.carregaDados();
	}

	private void initComandos() {
		comandos.put("emp", Fabrica.criarEmprestarComando());  // ok!
		comandos.put("dev", Fabrica.criarDevolverComando()); // ok!
		comandos.put("res", Fabrica.criarReservarLivroComando()); // ok!
		comandos.put("obs", Fabrica.criarRegistrarProfessorObservadorComando()); //ok!
		comandos.put("liv", Fabrica.criarConsultarLivroComando()); // ok
		comandos.put("usu", Fabrica.criarConsultarUsuarioComando()); // ok!
		comandos.put("ntf", Fabrica.criarConsultarVezesNotificaoReservaComando()); // ok!
		comandos.put("sai", Fabrica.criarSairComando()); // ok!
	}

	public void executarComando(String comandoString, ParametrosEntrada parametros) {
		// enxerga a string passada como comando
		Comando comando = this.comandos.get(comandoString);
		comando.executar(parametros);
	}
}
