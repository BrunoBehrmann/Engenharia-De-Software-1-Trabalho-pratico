package lib;

public class BancoDeDados {

	public void carregaDados() {
		Usuario u1 = new Aluno(123, "João da Silva");

		Livro l1 = new Livro(100, "Engenharia de Software", "AddisonWesley", "Ian Sommervile", "6ª", 2000);

		Exemplar e1 = new Exemplar(100, "Engenharia de Software", "AddisonWesley", "Ian Sommervile", "6ª", 2000, 01, true);
		
		// Obtém a instância do repositório
        Repositorio repositorio = Repositorio.getInstancia();

        // Adiciona os objetos às listas no repositório
        repositorio.adicionarUsuario(u1);
        repositorio.adicionarLivro(l1);
        // Se houver uma lista de exemplares, adicionar e1 também
        // repositorio.adicionarExemplar(e1); // Caso a lista de exemplares exista
	}
	
}
