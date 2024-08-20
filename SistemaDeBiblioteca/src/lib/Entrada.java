package lib;

import java.util.Scanner;

public class Entrada {
	
	private String stringEntrada;
	
	Entrada() {
		Scanner scanner = new Scanner(System.in);
        this.stringEntrada = scanner.nextLine(); // Lê a entrada como uma string
        scanner.close(); // Fecha o Scanner
	}
	
	public String pegaComandoDaEntrada() {
		String[] partes = this.stringEntrada.split(" ");
		
		return partes[0];
	}
	
	public ParametrosEntrada pegaParamentrosDaEntrada() {
		String[] partes = this.stringEntrada.split(" ");
		ParametrosEntrada parametros = new ParametrosEntrada();
		
		int codigo1 = Integer.parseInt(partes[1]);
        int codigo2 = Integer.parseInt(partes[2]);
        
		parametros.setCodigo1(codigo1);
		parametros.setCodigo1(codigo2);
		
		return parametros;
	}
	
}
