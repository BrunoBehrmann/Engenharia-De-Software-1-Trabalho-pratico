package lib.command.strategy;

import lib.IUsuario;
import lib.Livro;
import lib.Repositorio;
import lib.Usuario;

public class EmprestimoAlunoGraduacao implements ITipoEmprestimo {

	@Override
	public void emprestar(IUsuario usuario, Livro livro) {

		if (usuario.temReservaLivro(livro)){
			Repositorio repositorio = Repositorio.getInstancia();
			if (repositorio.temExemplarDisponivel(livro)) {
				if (!usuario.isDevedor()) {
					
				} else {
					System.out.println("Não foi possível emprestar. O usuario " + usuario.getNome() + " é devedor de livro.");
				}
			} else {
				System.out.println("Não foi possível emprestar. Não há exemplares disponíveis para o livro " + livro.getTitulo() + ".");
			}
		} else {
			System.out.println("Não foi possível emprestar. O usuario " + usuario.getNome() + " não tem uma reserva para o livro " + livro.getTitulo() + ".");
		}
	}

}
