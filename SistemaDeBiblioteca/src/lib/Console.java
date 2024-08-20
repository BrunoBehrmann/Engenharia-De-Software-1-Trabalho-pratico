//Singleton
package lib;

public class Console {
	private static Console instance;
    private Sistema sistema;
    private Entrada entrada;

    private Console() {
    	sistema = new Sistema();
    	entrada = new Entrada();
    }

    public static Console getInstance() {
        if (instance == null) {
            instance = new Console();
        }
        return instance;
    }
    
    public void run() {
    	
        while (true) {
        System.out.print("> ");
            sistema.executarComando(entrada.pegaComandoDaEntrada(), entrada.pegaParamentrosDaEntrada());
        }
    }
}
