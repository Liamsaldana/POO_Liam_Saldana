package edu.liam.proyect.actividades.act3.process;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que maneja los productos y el catálogo de productos.
 * Se encarga de almacenar los productos en una lista y de realizar
 * operaciones básicas sobre ellos.
 */

public class ProductManager {

    // Almacenamos los productos en una lista
    private List<Product> catalogo;

    // Constructor
    public ProductManager() {
        catalogo = new ArrayList<>();
        inicializarProductos();
    }

    /**
     * Carga algunos productos por defecto, simulando la tienda Apple.
     */
    private void inicializarProductos() {
        // Ejemplos de productos con un 16% de impuesto (0.16)
        catalogo.add(new Product("iPhone 12", 799.99, 0.16));
        catalogo.add(new Product("iPhone 15", 999.99, 0.16));
        catalogo.add(new Product("MacBook Pro 13\"", 1299.99, 0.16));
        catalogo.add(new Product("AirPods", 199.99, 0.16));
        catalogo.add(new Product("Apple Watch", 299.99, 0.16));
    }

    /**
     * Agrega un producto nuevo al catálogo.
     * @param nombre Nombre del producto
     * @param costo Costo base del producto
     * @param impuesto Impuesto (por ejemplo, 0.16 para 16%)
     */
    public void agregarProducto(String nombre, double costo, double impuesto) {
        Product nuevo = new Product(nombre, costo, impuesto);
        catalogo.add(nuevo);
        System.out.println("Producto agregado al catálogo: " + nombre);
    }

    /**
     * Muestra la lista de productos existentes en el catálogo.
     */
    public void mostrarCatalogo() {
        System.out.println("\n=== Catálogo de productos ===");
        for (Product p : catalogo) {
            p.mostrarInfo();
        }
    }

    /**
     * Busca un producto por nombre. Retorna null si no lo encuentra.
     */
    public Product buscarProductoPorNombre(String nombreBuscado) {
        for (Product p : catalogo) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Compara dos productos por su precio de venta y devuelve el más barato.
     * Retorna null si ambos tienen el mismo precio.
     */
    public Product compararProductos(Product prodA, Product prodB) {
        double precioA = prodA.calcularPrecioVenta();
        double precioB = prodB.calcularPrecioVenta();

        if (precioA < precioB) {
            return prodA; // A es más barato
        } else if (precioB < precioA) {
            return prodB; // B es más barato
        } else {
            return null;  // Igual precio
        }
    }
}