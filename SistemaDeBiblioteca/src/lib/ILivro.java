package lib;

public interface ILivro extends IItemBiblioteca {
	
	public String getEditora();
	public void setEditora(String editora);
	
	public String getAutores();
	public void setAutores(String autores);
}
