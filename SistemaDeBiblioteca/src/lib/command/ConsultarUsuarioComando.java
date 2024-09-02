package lib.command;

import lib.Livro;
import lib.Repositorio;
import lib.Reserva;
import lib.console.ParametrosEntrada;
import lib.users.IUsuario;
import lib.users.Usuario;

import java.time.format.DateTimeFormatter;
import java.util.List;

import lib.Emprestimo;


public class ConsultarUsuarioComando implements Comando {
    @Override
	public void executar(ParametrosEntrada parametros) {
		 int codigoUsuario = parametros.getCodigo1();
		 Repositorio repositorio = Repositorio.getInstancia();

		 Usuario usuario = (Usuario) repositorio.buscaUsuarioPorCodigo(codigoUsuario);

         List<Emprestimo> listaEmprestimos = usuario.getEmprestimos();
         List<Reserva> listaReservas = usuario.getReservas();

         System.out.println("Empréstimos: \n");
         for (Emprestimo emprestimo: listaEmprestimos) {
            System.out.println("Título: " + emprestimo.getExemplar().getLivro().getTitulo());

            System.out.println("Data do empréstimo: " + emprestimo.getDataEmprestimo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

            if (emprestimo.isConcluido() == false) {
                System.out.println("Status: Em andamento");
            }
            else {
                System.out.println("Status: Concluído");
            }
            
            System.out.println("Data de devolução: " + emprestimo.getDataDevolucaoPrevista().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
         }
         System.out.println("\n");
         System.out.println("Reservas: \n");
         for (Reserva reserva: listaReservas) {
            System.out.println("Título: " + reserva.getLivro().getTitulo());
            System.out.println("Reserva: " + reserva.getDataDevolucao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
            
         }

	}
}
