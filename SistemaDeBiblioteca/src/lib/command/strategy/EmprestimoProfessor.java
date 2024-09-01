package lib.command.strategy;

import lib.Emprestimo;
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
					// ver se existem mais verificações para o professor
					
					
					Emprestimo emp = new Emprestimo(usuario, livro.buscaExemplar());
					usuario.adicionarEmprestimo(emp);
					usuario.removerReserva(livro);
					System.out.println("Sucesso! O livro " + livro.getTitulo() + " foi emprestado para o professor " + usuario.getNome() + ".");
					
				} else {
					System.out.println("Não foi possível emprestar o livro " + livro.getTitulo() + ". O professor " + usuario.getNome() + " é devedor de livro.");
				}
			} else {
				System.out.println("Não foi possível emprestar o livro " + livro.getTitulo() + ". Não há exemplares disponíveis para o livro " + livro.getTitulo() + ".");
			}
		} else {
			System.out.println("Não foi possível emprestar o livro " + livro.getTitulo() + ". O professor " + usuario.getNome() + " não tem uma reserva para o livro " + livro.getTitulo() + ".");
		}
	}

}
