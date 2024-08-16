package lib;

import java.util.HashMap;

public class Sistema {

	private HashMap<String, Comando> comandos = new HashMap<String, Comando>();
	
	public Sistema() {
		this.initComandos();
	}
	
	private void initComandos() {
		comandos.put("emp", new EmprestarComando());
		comandos.put("dev", new DevolverComando());
		comandos.put("liv", new ConsultarLivroComando());
	}
	
	public void executarComando(String comandoString, ParametrosEntrada parametros) {
		// encherga a string passada como comando
		Comando comando = this.comandos.get(comandoString);
		comando.executar(parametros);
	}
}
