package EjercicioTema9;

public class Cliente extends Persona{
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }


    // metodo mostrar datos del cliente
    public void datosCliente(String nombre, int edad, int numero, double credito){
        System.out.println("cliente: " + nombre + " edad: " + edad
                + " numero tel. " + numero + " credito: " + credito);
    }
}
