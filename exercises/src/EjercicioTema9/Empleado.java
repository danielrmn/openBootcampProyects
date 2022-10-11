package EjercicioTema9;

public class Empleado extends Persona{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void datosEmpleado(String nombre, int edad, int numero, double salario){
        System.out.println("Empleado: " + nombre + " edad: " + edad
                + " numero tel. " + numero + " salario: " + salario + "dolares mensuales");
    }
}
