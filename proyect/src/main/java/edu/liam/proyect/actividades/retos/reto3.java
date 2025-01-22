package edu.liam.proyect.actividades.retos;

import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pedimos la cantidad de elementos
        System.out.print("¿Cuántos números deseas ingresar? ");
        int n = sc.nextInt();

        // Creamos el arreglo de tamaño n
        int[] numeros = new int[n];

        // 2. Solicitamos los valores uno a uno
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        sc.close(); // Cerramos el Scanner (buena práctica)

        // 3. Encontramos el número más pequeño del arreglo
        int minimo = encontrarMinimo(numeros);

        // 4. Mostramos el resultado
        System.out.println("El número más pequeño es: " + minimo);
    }

    /**
     * Método auxiliar que recibe un arreglo de enteros y
     * retorna el menor valor dentro de él.
     */
    public static int encontrarMinimo(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("El arreglo está vacío o es nulo.");
        }
        
        // Asumimos que el primer elemento es el mínimo
        int minimo = arr[0];

        // Recorremos el resto del arreglo
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimo) {
                minimo = arr[i];
            }
        }
        return minimo;
    }
}
