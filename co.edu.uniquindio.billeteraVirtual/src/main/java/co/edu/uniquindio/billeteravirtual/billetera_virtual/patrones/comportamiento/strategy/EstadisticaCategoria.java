package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.strategy;

public class EstadisticaCategoria {

    public String nombre;
    public double valor;

    public EstadisticaCategoria(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }

    public void sumarValor(double adicional) {
        this.valor += adicional;

    }
}
