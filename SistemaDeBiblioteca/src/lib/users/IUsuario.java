package lib.users;

import lib.Emprestimo;
import lib.Livro;
import lib.Reserva;
import lib.command.strategy.ITipoEmprestimo;

public interface IUsuario {
	public abstract ITipoEmprestimo getTipoEmprestimo();
	
	public abstract boolean temReservaLivro(Livro livro);
	public abstract void removerReserva(Livro livro);
	public abstract void setQntReservas(int qntReservas);
	public abstract void adicionarReserva(Reserva reserva);
	public abstract int getQntReservas();
	
	public abstract boolean isDevedor();
	
	public abstract boolean temEmprestimoLivro(Livro livro);
	public abstract void adicionarEmprestimo(Emprestimo emp);
	public void removerEmprestimo(Livro livro);
	
	// verificar uso
	public abstract int getIdUsuario();

	public abstract String getNome();

	

	

	
	
	

}
