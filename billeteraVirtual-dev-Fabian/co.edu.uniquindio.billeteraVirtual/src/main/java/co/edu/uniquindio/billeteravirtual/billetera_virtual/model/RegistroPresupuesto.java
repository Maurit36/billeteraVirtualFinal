package co.edu.uniquindio.billeteravirtual.billetera_virtual.model;

import java.time.LocalDate;

public class RegistroPresupuesto {
    public LocalDate fecha;
    public double monto;

    public RegistroPresupuesto(LocalDate fecha, double monto) {
        this.fecha = fecha;
        this.monto = monto;
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }
}