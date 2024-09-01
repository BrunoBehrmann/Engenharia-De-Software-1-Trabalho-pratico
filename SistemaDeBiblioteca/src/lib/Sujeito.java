package lib;

import java.util.Iterator;
import java.util.List;

public interface Sujeito {
	public void adicionarObservador(Observador o);
	public void removerObservador(Observador o);
	public void notificarObservadores();
}