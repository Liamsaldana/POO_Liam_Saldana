package edu.liam.proyect.actividades.act2.ui;

import java.util.Scanner;

import edu.liam.proyect.actividades.act2.programa1.NameValidator;
import edu.liam.proyect.actividades.act2.programa2.NumGenerator;

public class CLI {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir la siguiente línea

            switch (opcion) {
                case 1 -> {
                    // Verificar nombre
                    System.out.print("Ingresa tu nombre: ");
                    String nombreIngresado = sc.nextLine();
                    // Llamamos a NameValidator para verificar
                    NameValidator.validateName(nombreIngresado);
                }
                case 2 -> {
                    // Generar e imprimir números pares
                    int[] pares = NumGenerator.generarPares2a100();
                    NumGenerator.imprimirPares(pares);
                }
                case 3 -> {
                    // Salir
                    System.out.println("Saliendo del programa...");
                }
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 3);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Verificar nombre");
        System.out.println("2. Generar números pares (2..100)");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }
}
