package lib;

import lib.command.strategy.ITipoEmprestimo;

public interface IUsuario {
	public abstract ITipoEmprestimo getTipoEmprestimo();

	public abstract int getIdUsuario();

	public abstract String getNome();

}
