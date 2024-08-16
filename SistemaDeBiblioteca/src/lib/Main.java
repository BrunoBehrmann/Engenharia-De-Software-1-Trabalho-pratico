package lib;

public class Main {

	public static void main(String[] args) {
		
		//adição dos dados
		Usuario u1 = new Aluno(123, "João da Silva");
		
		Livro l1 = new Livro(100, "Engenharia de Software", "AddisonWesley", "Ian Sommervile", "6ª", 2000);
		
		Exemplar e1 = new Exemplar(100, "Engenharia de Software", "AddisonWesley", "Ian Sommervile", "6ª", 2000, 01, true);
		
		Console console = Console.getInstance();
		console.run();
	}

}
