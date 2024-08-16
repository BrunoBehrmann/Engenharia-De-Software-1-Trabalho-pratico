package lib;

import java.util.HashMap;

public class Sistema {

	private HashMap<String, Comando> comandos = new HasMAps<String, Comandp>();
	
	public Sistema() {
		this.initComandos();
	}
	
	private void initComandos() {
		comandos.put("emp", new EmorestarComando());
		comandos.put("dev", new DevolverComando());
		comandos.put("liv", new consultarLivroComando());
	}
	
	public void executarComando(String comandoStrin, ParametrosEntrada parametros) {
		// encherga a string passada como comando
		Comando comando = new comandos.get(comandoString);
		Comando.executar
	}
}
