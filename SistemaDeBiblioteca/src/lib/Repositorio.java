//sigleton
package lib;

import java.util.List;

public class Repositorio {
	
	private List<Ususario> usuarios;
	private List<Livro> livros;
	private static Repositorio instancia;
	//construtor
	private Repositorio() {
		
	}
	
	public static Repositorio getInstancia() {
		if(instancia == null) {
			instancia = new Repositorio();
		}
		return instancia;
	}
	
	public Usuario usuario() {
		return 
	}
	
	public Livro buscalivroporcodigo(String codigoLivro) {
		}
	}
}
