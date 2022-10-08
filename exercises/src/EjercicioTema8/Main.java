package EjercicioTema8;

public class Main {
    public static void main(String[] args){
        // creando instancia
        Persona persona1 = new Persona();

        //setters
        persona1.setName("daniel");
        persona1.setAge(21);
        persona1.setTelNumber(1231341);

        //getters en variables
        String namePersona1 = persona1.getName();
        int agePersona1 = persona1.getAge();
        int numberPersona1 = persona1.getTelNumber();

        // metodo imprimir en pantalla
        System.out.println("nombre: " + namePersona1 + " edad: " + agePersona1 + " numero de tel. " + numberPersona1);
    }
}
