//Singleton
package lib;

import java.util.Scanner;

public class Console {
	private static Console instance;
    private Sistema sistema;
    private Scanner scanner;

    private Console() {
        sistema = new Sistema();
        scanner = new Scanner(System.in);
    }

    public static Console getInstance() {
        if (instance == null) {
            instance = new Console();
        }
        return instance;
    }
    
    public void run() {
    	
        String comando;
        while (true) {
        System.out.print("> ");
            comando = scanner.nextLine().trim();
            sistema.executarComando(comando, null);
        }
    }
}
