package EjerciciosTema4;

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args){
        System.out.println("escriba una estacion: ");

        Scanner sc = new Scanner(System.in);
        String estacion = sc.nextLine();

        switch (estacion){
            case "primavera":
            case "verano":
            case "otoño":
            case "invierno":
                System.out.println("estamos en: " + estacion);
                break;
            default:
                System.out.println("no es una estacion");
        }
    }
}
