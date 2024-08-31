package lib.command.strategy;

import lib.IUsuario;
import lib.Livro;
import lib.Usuario;

public class EmprestimoAlunoPosGraduacao implements ITipoEmprestimo {

	@Override
	public void emprestar(IUsuario usuario, Livro livro) {
		if (usuario.temReservaLivro(livro)){
			
		} else {
			System.out.println("O usuario " + usuario.getNome() + " não tem uma reserva para o livro " + livro.getTitulo() + ".");
		}
	}

}
