package lib;

import lib.command.strategy.ITipoEmprestimo;

public interface IUsuario {
	public abstract ITipoEmprestimo getTipoEmprestimo();
	
	public boolean temReservaLivro(Livro livro);
	public boolean isDevedor();
	
	// verificar uso
	public abstract int getIdUsuario();

	public abstract String getNome();
	
	

}
