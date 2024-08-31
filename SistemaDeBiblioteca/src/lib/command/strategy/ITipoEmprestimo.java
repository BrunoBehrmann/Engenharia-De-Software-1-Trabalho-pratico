package lib.command.strategy;

import lib.IUsuario;
import lib.Livro;

// estrategia
public interface ITipoEmprestimo {
	void emprestar(IUsuario usuario, Livro livro);
}
