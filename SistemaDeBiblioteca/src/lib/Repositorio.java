//sigleton
package lib;

import java.util.List;

import lib.users.IUsuario;

import java.util.ArrayList;

public class Repositorio {
	
	private List<IUsuario> usuarios;
	private List<Livro> livros;
	private static Repositorio instancia;
	//construtor
	private Repositorio() {
		this.usuarios = new ArrayList<IUsuario>();
        this.livros = new ArrayList<Livro>();
	}
	
	public static Repositorio getInstancia() {
		if(instancia == null) {
			instancia = new Repositorio();
		}
		return instancia;
	}
	
	public IUsuario buscaUsuarioPorCodigo(int codigoUsuario) {
		for (IUsuario usuarioLista: this.usuarios) {
			if (usuarioLista.getIdUsuario() == codigoUsuario) {
				return usuarioLista;
			}
		}
		return null;
	}
	
	/*public IAluno buscaAlunoPorCodigo(int codigoAluno) {
		for (IUsuario usuarioLista: usuarios) {
			if (usuarioLista.getIdUsuario() == codigoAluno) {
				return usuarioLista;
			}
		}
		return null;
	}*/
	
	public Livro buscaLivroPorCodigo(int codigoLivro) {
		for (Livro livroLista: this.livros) {
			if (livroLista.getCodigoBiblioteca() == codigoLivro) {
				System.out.println();
				return livroLista;
			}
		}
		System.out.println("Livro nao encontrado");
		return null;
	}
	
	public boolean temExemplarDisponivel(Livro livro) {
		if (buscaLivro(livro).getQntExemplaresDisponiveis() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void adicionarLivro(Livro livro) {
		this.livros.add(livro);
	}
	
	public void adicionarUsuario(IUsuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public Livro buscaLivro(Livro livro) {
		for (Livro livroRepositorio: this.livros) {
			if (livroRepositorio == livro)
				return livroRepositorio;
		}
		return null;
	}
	
	public Exemplar buscaExemplar(Livro livro) {
		return livro.buscaExemplar();
	}
	
}
