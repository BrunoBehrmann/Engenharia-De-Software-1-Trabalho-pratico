package lib;

public class Professor implements Observador {
  public void atualizar(Usuario usuario) {
    int qntReservas = ((Usuario) usuario).getQntReservas();
    //System.out.println("Quantidade de Reservas: " + temp);
  }
}