//Singleton
package lib;

import java.util.Scanner;

public class Entrada {
	private static Entrada instance;
	private String stringEntrada;
	private Sistema sistema;
	private Scanner scanner = new Scanner(System.in);
	private Entrada() {
		sistema = new Sistema();
	}
	
	public static Entrada getInstance() {
        if (instance == null) {
            instance = new Entrada();
        }
        return instance;
    }
	
	public void run() {
		while (true) { // Loop contínuo
            System.out.print("> ");
            this.stringEntrada = scanner.nextLine(); // Lê a entrada como uma string
            sistema.executarComando(pegaComandoDaEntrada(), pegaParamentrosDaEntrada());
        }
		
	}
	
	public String pegaComandoDaEntrada() {
		String[] partes = this.stringEntrada.split(" ");
		
		return partes[0];
	}
	
	public ParametrosEntrada pegaParamentrosDaEntrada() {
		String[] partes = this.stringEntrada.split(" ");
		ParametrosEntrada parametros = new ParametrosEntrada();
		if (partes.length == 1) {
			return null;
		}
		int codigo1 = Integer.parseInt(partes[1]);
        int codigo2 = Integer.parseInt(partes[2]);
        
		parametros.setCodigo1(codigo1);
		parametros.setCodigo1(codigo2);
		
		return parametros;
	}
	
}
