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
	
	public Usuario buscaUsuarioPorCodigo(int codigoUsuario) {
		for (Usuario usuarioLista: usuarios) {
			if (usuarioLista.getId() == codigoUsuario) {
				return usuarioLista;
			}
		}
		System.out.println("Usuario nao encontrado");
		return null;
		
	}
	
	public Livro buscaLivroPorCodigo(int codigoLivro) {
		for (Livro livroLista: livros) {
			if (livroLista.getCodigo() == codigoLivro) {
				System.out.println();
				return livroLista;
			}
		}
		System.out.println("Livro nao encontrado");
		return null;
	}
	
	
}
