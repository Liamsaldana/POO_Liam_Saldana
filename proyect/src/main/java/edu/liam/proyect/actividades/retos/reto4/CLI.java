package edu.liam.proyect.actividades.retos.reto4;

import java.util.Scanner;

public class CLI {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir la siguiente línea

            switch (opcion) {
                case 1 -> {
                    // Opción 1: Arreglo ya ORDENADO y usamos SortedSquaresProcessor
                    System.out.print("¿Cuántos números (ordenados) vas a ingresar? ");
                    int n = sc.nextInt();
                    int[] numeros = new int[n];

                    System.out.println("Ingresa los números en orden (incluyendo negativos si aplica):");
                    for (int i = 0; i < n; i++) {
                        numeros[i] = sc.nextInt();
                    }

                    // Usar la lógica de dos punteros
                    int[] resultado = SortedSquaresProcessor.sortedSquares(numeros);

                    System.out.println("Arreglo resultante (cuadrados ordenados) [dos punteros]:");
                    for (int num : resultado) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                case 2 -> {
                    // Opción 2: Flujo “existente” con Rootmath y Ordenador
                    System.out.print("¿Cuántos números vas a ingresar? ");
                    int n = sc.nextInt();
                    int[] numeros = new int[n];

                    // Llenar arreglo (no necesariamente ordenado)
                    for (int i = 0; i < n; i++) {
                        System.out.print("Ingresa el número " + (i + 1) + ": ");
                        numeros[i] = sc.nextInt();
                    }

                    // Elevar cada elemento al cuadrado usando Rootmath
                    int[] cuadrados = Rootmath.squareArray(numeros);

                    // Ordenar el nuevo arreglo de cuadrados con Ordenador
                    int[] ordenados = Ordenador.sortArray(cuadrados);

                    // Mostrar el resultado
                    System.out.println("Arreglo resultante (cuadrados ordenados):");
                    for (int num : ordenados) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                case 3 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n========== MENÚ ==========");
        System.out.println("1. Elevar al cuadrado (arreglo YA ordenado) y ordenar [dos punteros]");
        System.out.println("2. Elevar al cuadrado y ordenar");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }
}