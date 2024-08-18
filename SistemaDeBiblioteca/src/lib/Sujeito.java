public class Sujeito {
  private List<Observador> observadores;
  
  public void addObservador(Observador observador) {
    observadores.add(observador);
  }

  public void removerObservador(Observador observador) {
    observadores.remove(observador);
  }

  public void notificarObservador(Observador observador) {
    Iterator i = observadores.iterator();

    while (i.HasNext()) {
      Observador o =  (Observador) i.next();
          o.update(this); 
    }
  }
}