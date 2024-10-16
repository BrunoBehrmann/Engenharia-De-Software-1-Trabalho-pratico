package lib.command.strategy;

import java.time.LocalDateTime;

import lib.Emprestimo;
import lib.Fabrica;
import lib.Livro;
import lib.Repositorio;
import lib.users.IUsuario;
import lib.users.Usuario;

public class EmprestimoProfessor implements ITipoEmprestimo {

	@Override
	public void emprestar(IUsuario usuario, Livro livro) {

		if (usuario.temReservaLivro(livro)){
			
			Repositorio repositorio = Repositorio.getInstancia();
			if (repositorio.temExemplarDisponivel(livro)) {
				if (!usuario.isDevedor()) {
					
					Emprestimo emp = Fabrica.criarEmprestimo(usuario, livro.buscaExemplar(), LocalDateTime.now(), 7);
					livro.buscaExemplar().setEmprestimo(emp);
					usuario.adicionarEmprestimo(emp);
					livro.removerReserva(livro, usuario);
					usuario.removerReserva(livro);
					System.out.println("Sucesso! O livro " + livro.getTitulo() + " foi emprestado para o professor " + usuario.getNome() + ".");
					
					
				} else {
					System.out.println("Não foi possível emprestar o livro " + livro.getTitulo() + ". O professor " + usuario.getNome() + " é devedor de livro.");
				}
			} else {
				System.out.println("Não foi possível emprestar o livro " + livro.getTitulo() + ", não há exemplares disponíveis.");
			}
		} else {
			System.out.println("Não foi possível emprestar o livro " + livro.getTitulo() + ". O professor " + usuario.getNome() + " não tem uma reserva para o livro " + livro.getTitulo() + ".");
		}
	}

}
