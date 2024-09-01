package lib;

import lib.command.strategy.ITipoEmprestimo;

public interface IUsuario {
	public abstract ITipoEmprestimo getTipoEmprestimo();
	
	public abstract boolean temReservaLivro(Livro livro);
	public abstract boolean isDevedor();
	public abstract int getQntReservas();
	public abstract void setQntReservas(int qntReservas);
	public abstract void adicionarReserva(Reserva reserva);
	public abstract void removerReserva(Livro livro);
	public abstract void adicionarEmprestimo(Emprestimo emp);
	// verificar uso
	public abstract int getIdUsuario();

	public abstract String getNome();

	

	
	
	

}
