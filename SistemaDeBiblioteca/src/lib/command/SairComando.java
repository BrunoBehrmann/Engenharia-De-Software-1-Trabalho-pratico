package lib.command;

import lib.console.ParametrosEntrada;

public class SairComando implements Comando {

	@Override
	public void executar(ParametrosEntrada parametros) {
		
		System.out.println("Sistema encerrado.");
		System.exit(0);
	}

}
