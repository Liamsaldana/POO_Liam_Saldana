package edu.liam.proyect.actividades.retos;

import java.util.Scanner;

/**
 * Reto #1: Invertir una cadena
 */

public class reto1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String original = sc.nextLine();
        sc.close();

        String invertida = reverseStringSinReverse(original);

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }

    /**
     * Invierte la cadena sin usar StringBuilder.reverse().
     */
    public static String reverseStringSinReverse(String str) {
        // Almacenamos el resultado en un StringBuilder (o en un String), 
        // pero sin usar la función reverse().
        StringBuilder sb = new StringBuilder();

        // Recorremos la cadena de atrás hacia adelante.
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
