package lib;

import java.time.LocalDateTime;

public class Fabrica {
    public static Emprestimo criarEmprestimo(Usuario usuario, Exemplar exemplar, LocalDateTime LocalDateTime, int dias) {
        return new Emprestimo(usuario, exemplar, LocalDateTime, dias);
    }
}
