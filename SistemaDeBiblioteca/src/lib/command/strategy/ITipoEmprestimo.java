package lib.command.strategy;

import lib.Livro;
import lib.Usuario;

// estrategia
public interface ITipoEmprestimo {
	public void emprestar(Usuario ususairo, Livro livro);
}
