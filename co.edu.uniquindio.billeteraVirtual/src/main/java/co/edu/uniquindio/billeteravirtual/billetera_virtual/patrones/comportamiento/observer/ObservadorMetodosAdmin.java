package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.observer;

public interface ObservadorMetodosAdmin {
    void agregarObserver(ObservadorAdministrador observador);
    void eliminarObserver(ObservadorAdministrador observador);
    void notificarObservers();
}
