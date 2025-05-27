package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.command;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Administrador;

public class ReporteAdminCommand implements Command {

    public Administrador administrador;
    public String formato; 

    public ReporteAdminCommand(Administrador administrador, String formato){
        this.administrador = administrador;
        this.formato = formato; 
    }

    @Override
    public void execute() {
       administrador.generarReporte(formato);
    }

    
}
