package lib.command;

import lib.ParametrosEntrada;
import lib.Repositorio;
import lib.users.Professor;

public class ConsultarVezesNotificaoReservaComando implements Comando{
    @Override
	public void executar(ParametrosEntrada parametros) {
		 int codigoUsuario = parametros.getCodigo1();
		 Repositorio repositorio = Repositorio.getInstancia();

		 Professor usuario = (Professor) repositorio.buscaUsuarioPorCodigo(codigoUsuario);

         System.out.println(usuario.getContadorNotificacoes());
    }
}
