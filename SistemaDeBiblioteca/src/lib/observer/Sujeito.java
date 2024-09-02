package lib.observer;

public interface Sujeito {
	public void adicionarObservador(Observador o);
	public void removerObservador(Observador o);
	public void notificarObservadores();
}