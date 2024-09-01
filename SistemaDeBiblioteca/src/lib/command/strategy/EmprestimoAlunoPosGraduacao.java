package lib.command.strategy;

import lib.IUsuario;
import lib.Livro;
import lib.Repositorio;
import lib.Usuario;

public class EmprestimoAlunoPosGraduacao implements ITipoEmprestimo {

	@Override
	public void emprestar(IUsuario usuario, Livro livro) {

		if (usuario.temReservaLivro(livro)){
			Repositorio repositorio = Repositorio.getInstancia();
			if (repositorio.temExemplarDisponivel(livro)) {
				if (!usuario.isDevedor()) {
					// implementar logica de verificao: o Limite de Empréstimos em Aberto do aluno de pos-graduação é < 4 ? 
					/*if () {
						
						
						// realiza o emprestimo
						
						// remove reversa para o emprestimo 
						
					} else {
						System.out.println("Não foi possível emprestar o livro " + livro.getTitulo() + ". O aluno de pos-graduação " + usuario.getNome() + " já está com o limite máximo de emprestimos em aberto.");
					}*/
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
