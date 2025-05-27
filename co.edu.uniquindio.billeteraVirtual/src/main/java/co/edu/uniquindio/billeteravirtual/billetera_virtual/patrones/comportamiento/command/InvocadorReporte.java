package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.command;

public class InvocadorReporte {
    private Command command;

    public void setCommand (Command command){
        this.command = command;
    }

    public void ejecutar(){
        if ( command != null){
            command.execute();
        }
    }
}
