package lib.command;

import lib.Livro;
import lib.ParametrosEntrada;
import lib.Repositorio;
import lib.Reserva;
import lib.users.IUsuario;
import lib.users.Usuario;

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
            System.out.println("Título: " + emprestimo.getExemplar().getLivro().getTitulo()); //isso aqui ta feio
            System.out.println("\n");

            System.out.println("Data do empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println("\n");

            if (emprestimo.getStatus() == false) {
                System.out.println("Status: Em andamento");
                System.out.println("\n");
            }
            else {
                System.out.println("Status: Concluído");
                System.out.println("\n");
            }
            
            System.out.println("Data de devolução: " + emprestimo.getDataDevolucaoPrevista());
            System.out.println("\n");
         }

         System.out.println("Reservas: \n");
         for (Reserva reserva: listaReservas) {
            System.out.println("Título: " + reserva.getLivro().getTitulo());
            System.out.println("Reserva: " + reserva.getDataDevolucao());
            System.out.println("\n");
         }




		 
	}
}
