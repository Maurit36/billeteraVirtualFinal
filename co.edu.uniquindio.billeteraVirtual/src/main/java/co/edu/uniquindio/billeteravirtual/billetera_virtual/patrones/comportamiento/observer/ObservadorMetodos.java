package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.observer;

public interface ObservadorMetodos {
    void agregarObserver(Observador observador);
    void eliminarObserver(Observador observador);
    void notificarObservers();
}
