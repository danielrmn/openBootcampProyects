package EjercicioTema9;

public class Main {
    public static void main(String[] args){
        Cliente juan = new Cliente();
        Empleado carlos = new Empleado();

        carlos.datosEmpleado("carlos", 23, 4444999, 999);
        juan.datosCliente("juan", 38, 3333000, 403.33);
    }
}
