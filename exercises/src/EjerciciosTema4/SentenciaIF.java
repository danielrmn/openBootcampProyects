package EjerciciosTema4;

import java.util.Scanner;

public class SentenciaIF {
    public static void main(String[] args){
        System.out.println("Escribe un numero y determinare si es positvo, negativo o 0");

        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine());

        if (numero > 0){
            System.out.println(numero + " es POSITIVO");
        } else if (numero < 0) {
            System.out.println(numero + " es NEGATIVO");
        } else {
            System.out.println("Es 0");
        }
    }
}
