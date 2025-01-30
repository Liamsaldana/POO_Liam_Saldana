package edu.liam.proyect.actividades.retos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


//* Reto #2: Buscar palabra duplicada


public class reto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();
        sc.close();

        // Llamamos al método para buscar duplicado y guardamos la posición
        int posicionDuplicada = primeraLetraDuplicada(palabra);

        if (posicionDuplicada == -1) {
            System.out.println("No se encontraron letras duplicadas.");
        } else {
            // Imprimimos la letra y la posición en la que aparece duplicada
            System.out.println("La primera letra duplicada es '"
                    + palabra.charAt(posicionDuplicada)
                    + "' en la posición " + (posicionDuplicada + 1));
        }
    }

    /**
     * Devuelve el índice (0-based) de la primera letra duplicada en la palabra.
     * Si no hay duplicado, retorna -1.
     */
    public static int primeraLetraDuplicada(String palabra) {
        Set<Character> letrasVistas = new HashSet<>();

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);

            if (letrasVistas.contains(c)) {
                return i; // retornamos la posición 0-based donde se encontró
            } else {
                letrasVistas.add(c);
            }
        }
        return -1; // sin duplicados
    }
}