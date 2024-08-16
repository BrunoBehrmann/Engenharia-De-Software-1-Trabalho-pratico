//sigleton
package lib;

import java.util.List;

public class Repositorio {
	
	private List<Usuario> usuarios;
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
	
	public Usuario buscaUsuarioPorCodigo(String codigoUsuario) {
		return null;
		
	}
	
	public Livro buscaLivroPorCodigo(String codigoLivro) {
		return null;
	}
	
	
}
