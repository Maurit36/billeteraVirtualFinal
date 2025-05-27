package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.strategy;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Cuenta;

import java.util.List;

public interface EstrategiaCuenta {
    String getTitulo();
    List<String[]> generarContenido(Cuenta cuenta);
}
