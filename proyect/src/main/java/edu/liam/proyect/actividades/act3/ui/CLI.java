package edu.liam.proyect.actividades.act3.ui;

import java.util.Scanner;

import edu.liam.proyect.actividades.act3.process.ProductManager;
import edu.liam.proyect.actividades.act3.process.Product;

/**
 * Clase que maneja la interfaz de usuario.
 * Permite al usuario realizar operaciones sobre el catálogo de productos.
 * Se encarga de leer las opciones del usuario y de realizar las operaciones
 * correspondientes.
 */

public class CLI {
    
    public static void start() {
        Scanner sc = new Scanner(System.in);
        ProductManager manager = new ProductManager();

        int opcion = 0;
        while (opcion != 4) {
            mostrarMenu();
            opcion = leerEntero(sc);

            switch (opcion) {
                case 1 -> {
                    // 1. Mostrar catálogo
                    manager.mostrarCatalogo();
                }
                case 2 -> {
                    // 2. Comparar dos productos existentes
                    System.out.print("Ingresa el nombre del primer producto: ");
                    String nombreA = sc.nextLine();
                    System.out.print("Ingresa el nombre del segundo producto: ");
                    String nombreB = sc.nextLine();

                    Product prodA = manager.buscarProductoPorNombre(nombreA);
                    Product prodB = manager.buscarProductoPorNombre(nombreB);

                    if (prodA == null || prodB == null) {
                        System.out.println("Uno de los productos no fue encontrado en el catálogo.");
                    } else {
                        Product masBarato = manager.compararProductos(prodA, prodB);
                        if (masBarato == null) {
                            System.out.println("Ambos productos tienen el mismo precio de venta.");
                        } else {
                            System.out.println("\nEl producto más barato es: " + masBarato.getNombre() +
                                    " ($" + masBarato.calcularPrecioVenta() + ")");
                        }
                    }
                }
                case 3 -> {
                    // 3. Agregar un nuevo producto
                    System.out.print("Nombre del nuevo producto: ");
                    String nombreNuevo = sc.nextLine();

                    System.out.print("Costo base del nuevo producto: ");
                    double costoNuevo = leerDouble(sc);

                    System.out.print("Impuesto (ej. 0.16 para 16%): ");
                    double impuestoNuevo = leerDouble(sc);

                    manager.agregarProducto(nombreNuevo, costoNuevo, impuestoNuevo);
                }
                case 4 -> {
                    // 4. Salir
                    System.out.println("Saliendo del programa.");
                }
                default -> {
                    System.out.println("Opción no válida. Intenta de nuevo.");
                }
            }
        }

        sc.close();
    }
/**
 * @param args the command line arguments
 * @throws java.lang.Exception
 * 
 */
    private static void mostrarMenu() {
        System.out.println("\n===== Menú de la Tienda PERA =====");
        System.out.println("1. Ver catálogo de productos");
        System.out.println("2. Comparar dos productos");
        System.out.println("3. Agregar un nuevo producto");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    /**
     * Lee un entero con manejo básico de errores.
     */
    private static int leerEntero(Scanner sc) {
        int valor;
        try {
            valor = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            valor = -1; // valor inválido para forzar default
        }
        return valor;
    }

    /**
     * Lee un double con manejo básico de errores.
     */
    private static double leerDouble(Scanner sc) {
        double valor;
        try {
            valor = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            valor = 0.0; // valor por defecto
        }
        return valor;
    }
}
