package lib.command.strategy;

import java.time.LocalDateTime;

import lib.Emprestimo;
import lib.Livro;
import lib.Repositorio;
import lib.users.IAluno;
import lib.users.IUsuario;
import lib.users.Usuario;

public class EmprestimoAlunoPosGraduacao implements ITipoEmprestimo {

	@Override
	public void emprestar(IUsuario usuario, Livro livro) {

		if (usuario.temReservaLivro(livro)){
			Repositorio repositorio = Repositorio.getInstancia();
			if (repositorio.temExemplarDisponivel(livro)) {
				if (!usuario.isDevedor()) {
					IAluno aluno = (IAluno) usuario;
					if (aluno.podeFazerEmprestimo()) {
						
						Emprestimo emp = new Emprestimo(usuario, livro.buscaExemplar(), LocalDateTime.now(), 4);
						livro.buscaExemplar().setEmprestimo(emp);
						usuario.adicionarEmprestimo(emp);
						livro.removerReserva(livro);
						usuario.removerReserva(livro);
						System.out.println("Sucesso! O livro " + livro.getTitulo() + " foi emprestado para o aluno de pos-graduação " + usuario.getNome() + ".");
						
					} else {
						System.out.println("Não foi possível emprestar o livro " + livro.getTitulo() + ". O aluno de pos-graduação " + usuario.getNome() + " já está com o limite máximo de emprestimos em aberto.");
					}
				} else {
					System.out.println("Não foi possível emprestar o livro " + livro.getTitulo() + ". O aluno de pos-graduação " + usuario.getNome() + " é devedor de livro.");
				}
			} else {
				System.out.println("Não foi possível emprestar o livro " + livro.getTitulo() + ". Não há exemplares disponíveis para o livro " + livro.getTitulo() + ".");
			}
		} else {
			System.out.println("Não foi possível emprestar o livro " + livro.getTitulo() + ". O aluno de pos-graduação " + usuario.getNome() + " não tem uma reserva para o livro " + livro.getTitulo() + ".");
		}
	}
}
