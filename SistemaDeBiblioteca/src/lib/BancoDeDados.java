package lib;

public class BancoDeDados {

	public void carregaDados() {
		
		Repositorio repositorio = Repositorio.getInstancia();
		
		// passar dados para o banco
		IUsuario u1 = new AlunoGraduacao(123, "João da Silva");
		IUsuario u2 = new AlunoPosGraduacao(456, "JLuiz Fernando Rodrigues");
		IUsuario u3 = new AlunoGraduacao(789, "Pedro Paulo");
		IUsuario u4 = new Professor(100, "Carlos Lucena");
		repositorio.adicionarUsuario(u1);
		repositorio.adicionarUsuario(u2);
		repositorio.adicionarUsuario(u3);
		repositorio.adicionarUsuario(u4);
		
		

		Livro l1 = new Livro(100, "Engenharia de Software", "AddisonWesley", "Ian Sommervile", "6ª", 2000);

		Exemplar e1 = new Exemplar(100, "Engenharia de Software", "AddisonWesley", "Ian Sommervile", "6ª", 2000, 01, true);
		
		// Obtém a instância do repositório
        
        
        // Adiciona os objetos às listas no repositório
        //repositorio.adicionarUsuario(u1);
        repositorio.adicionarLivro(l1);
        // Se houver uma lista de exemplares, adicionar e1 também
        // repositorio.adicionarExemplar(e1); // Caso a lista de exemplares exista
	}
	
}
