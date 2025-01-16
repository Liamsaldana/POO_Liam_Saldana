
package edu.liam.proyect.actividades.act1.ui;

import java.util.Scanner;

public class CLI {

    public static void showMenu() {
        System.out.println("1. Crear Nuevo Estudiante");
        System.out.println("2. Listar Estudiantes");
        System.out.println("3. Salir");
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println("Hola, soy el CLI");
    }
    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
    public void mostrarEstudiantes(String[] estudiantes) {
        System.out.println("Estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
    public static void launch() {
        showMenu();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        while (opcion != 3) {
            switch (opcion) {
                case 1 -> System.out.println("Crear Estudiante");
                case 2 -> System.out.println("Listar Estudiantes");
                case 3 -> System.out.println("Salir");
                default -> System.out.println("Opcion no valida");
        }
        showMenu();
        opcion = scanner.nextInt();

       }}
}
