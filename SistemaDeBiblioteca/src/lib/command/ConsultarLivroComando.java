package lib.command;

import java.time.format.DateTimeFormatter;

import lib.Exemplar;
import lib.Livro;
import lib.ParametrosEntrada;
import lib.Repositorio;
import lib.Reserva;
import lib.users.IUsuario;

public class ConsultarLivroComando implements Comando {

	@Override
	public void executar(ParametrosEntrada parametros) {
		int codigoLivro = parametros.getCodigo1();
		Repositorio repositorio = Repositorio.getInstancia();
		Livro livro = repositorio.buscaLivroPorCodigo(codigoLivro);

		System.out.println("CONSULTA DE LIVRO");
		System.out.println("Titulo do livro: " + livro.getTitulo() + ".\n");
		if (livro.getQntReservas() == 0) {
			System.out.println("Quantidade de reservas: " + livro.getQntReservas());
		} else {
			System.out.println("Quantidade de reservas: " + livro.getQntReservas());
			System.out.println("Usuarios que realizaram a(s) reserva(s): ");
			for (Reserva reserva: livro.getReservas()) {
				if (reserva.getLivro() == livro) {
					System.out.println(" - " + reserva.getUsuario().getNome() + ".");
				}
			}
		}
		System.out.println("\nInformações dos exemplares");
		for (Exemplar exemplar: livro.getExemplares()) {
			if (exemplar.isDisponivel()) {
				System.out.println("Código exemplar: " + exemplar.getCodigoExemplar() + " - Status: " + exemplar.getStatusDisponivel() + ".");
			} else {
				System.out.println("Código exemplar: " + exemplar.getCodigoExemplar() + " - Status: " + exemplar.getStatusDisponivel() + "."); 
				System.out.println(" - Usuario portador: " + exemplar.getEmprestimo().getUsuario().getNome() 
					    + "\n - Data de emprestimo: " + exemplar.getEmprestimo().getDataEmprestimo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) 
					    + "\n - Data prevista para devolução: " + exemplar.getEmprestimo().getDataDevolucaoPrevista().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + ".");
}

		}
		System.out.println();

	}

}
