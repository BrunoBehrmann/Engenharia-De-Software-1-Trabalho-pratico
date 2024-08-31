package lib;

public class BancoDeDados {

	public void carregaDados() {
		
		Repositorio repositorio = Repositorio.getInstancia();
		
		// criacao e adicao de usuarios ao repositorio/biblioteca
		IUsuario u1 = new AlunoGraduacao(123, "João da Silva");
		IUsuario u2 = new AlunoPosGraduacao(456, "JLuiz Fernando Rodrigues");
		IUsuario u3 = new AlunoGraduacao(789, "Pedro Paulo");
		IUsuario u4 = new Professor(100, "Carlos Lucena");
		repositorio.adicionarUsuario(u1);
		repositorio.adicionarUsuario(u2);
		repositorio.adicionarUsuario(u3);
		repositorio.adicionarUsuario(u4);
		
		// livros
		Livro l100 = new Livro(100, "Engenharia de Software", "AddisonWesley", "Ian Sommervile", "6ª", 2000);
		Livro l101 = new Livro(101, "UML - Guia do Usuário", "Campus", "Grady Booch, James Rumbaugh, Ivar Jacobson", "7ª", 2000);
		Livro l200 = new Livro(200, "Code Complete", "Microsoft Press", "Steve McConnell", "2ª", 2024);
		Livro l201 = new Livro(201, "Agile Software Development, Principles, Patterns and Practices", "Prentice Hall", "Robert Marin", "1ª", 2002);
		Livro l300 = new Livro(300, "Refactoring: Improving the Design of Existing Code", "Addison-Wesley Professional", "Martin Fowler", "1ª", 1999);
		Livro l301 = new Livro(301, "Software Metrics: A Rigorous and Practical Approach", "CRC Press", "Norman Fenton, James Bieman", "3ª", 2014);
		Livro l400 = new Livro(400, "Design Patterns: Elements of Reusable Object-Oriented Software", "Addison-Wesley Professional", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "1ª", 1994);
		Livro l401 = new Livro(401, "UML Distilled: A Brief Guide to the Standard Object Modeling Language", "Addison-Wesley Professiona", "Martin Fowler", "3ª", 2003);
		
		// cria exemplares
		Exemplar e1 = new Exemplar(l100, 1, true);
        Exemplar e2 = new Exemplar(l100, 2, true);
        Exemplar e3 = new Exemplar(l101, 3, true);
        Exemplar e4 = new Exemplar(l200, 4, true);
        Exemplar e5 = new Exemplar(l201, 5, true);
        Exemplar e6 = new Exemplar(l300, 6, true);
        Exemplar e7 = new Exemplar(l300, 7, true);
        Exemplar e8 = new Exemplar(l400, 8, true);
        Exemplar e9 = new Exemplar(l400, 9, true);
        
		// adicao dos exemplares aos seus respectivos livros
		l100.adicionarExemplar(e1);
		l100.adicionarExemplar(e2);
		l101.adicionarExemplar(e3);
		l200.adicionarExemplar(e4);
		l201.adicionarExemplar(e5);
		l300.adicionarExemplar(e6);
		l300.adicionarExemplar(e7);
		l400.adicionarExemplar(e8);
		l400.adicionarExemplar(e9);
		
	}
	
}
