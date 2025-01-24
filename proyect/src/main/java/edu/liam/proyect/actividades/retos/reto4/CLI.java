package edu.liam.proyect.actividades.retos.reto4;

import java.util.Scanner;

public class CLI {

    public static void start() {
        Scanner sc = new Scanner(System.in);

        // 1. Pedir la cantidad de números a ingresar
        System.out.print("¿Cuántos números vas a ingresar? ");
        int n = sc.nextInt();

        // 2. Crear un arreglo y llenarlo con los valores que ingresa el usuario
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 3. Elevar cada elemento al cuadrado usando Rootmath
        int[] cuadrados = Rootmath.squareArray(numeros);

        // 4. Ordenar el nuevo arreglo de cuadrados usando Ordenador
        int[] ordenados = Ordenador.sortArray(cuadrados);

        // 5. Mostrar el resultado
        System.out.println("Arreglo resultante (cuadrados ordenados):");
        for (int num : ordenados) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea final

        sc.close();
    }
}
