package lib;

import java.util.Iterator;
import java.util.List;

public interface Sujeito {
	public void adicionarObservador(Observador o);
	public void removerObservador(Observador o);
	public void notificarObservadores();
  /*private List<Observador> observadores;
  
  public void addObservador(Observador observador) {
    observadores.add(observador);
  }

  public void removerObservador(Observador observador) {
    observadores.remove(observador);
  }

  public void notificarObservador(Observador observador) {
    Iterator i = observadores.iterator();

    while (i.hasNext()) {
      Observador o =  (Observador) i.next();
          o.atualizar(this); 
    }
  }*/
}