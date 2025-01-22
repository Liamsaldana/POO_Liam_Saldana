
package edu.liam.proyect.actividades.act1.ui;

import java.util.Scanner;

import edu.liam.proyect.actividades.act1.process.StockManager;

public class CLI {

    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();

        showMenu();
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea sobrante tras nextInt

        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el número de puertas:");
                    int numPuertas = scanner.nextInt();
                    scanner.nextLine(); // Consumimos la línea sobrante
                    
                    System.out.println("Introduce el color:");
                    String color = scanner.nextLine();
                    
                    System.out.println("Introduce el modelo:");
                    String modelo = scanner.nextLine();
                    
                    System.out.println("Introduce la marca:");
                    String marca = scanner.nextLine();
                    
                    stockManager.addCar(modelo, marca, numPuertas, color);
                    break;
                case 2:
                    stockManager.printStock();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
            showMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea sobrante
        }
        
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("""
                Menú:
                1. Agregar Carro al catálogo
                2. Mostrar catálogo
                3. Salir
                """); 
    }
}
