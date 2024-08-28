package lib.command.strategy;

import lib.IUsuario;
import lib.Livro;
import lib.Usuario;

public class EmprestimoAlunoGraduacao implements ITipoEmprestimo {

	@Override
	public void emprestar(IUsuario usuario, Livro livro) {
		// TODO Auto-generated method stub
		// verifica se tem imprestimo
		
		System.out.println("O usuario " + usuario.getNome() + " não tem uma reserva para o livro " + livro.getTitulo() + ".");
	}

}
