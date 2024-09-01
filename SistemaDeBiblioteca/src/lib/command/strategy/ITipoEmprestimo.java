package lib.command.strategy;

import lib.Livro;
import lib.users.IUsuario;

// estrategia
public interface ITipoEmprestimo {
	void emprestar(IUsuario usuario, Livro livro);
}
