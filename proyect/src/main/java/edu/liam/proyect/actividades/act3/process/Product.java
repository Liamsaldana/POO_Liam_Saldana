package edu.liam.proyect.actividades.act3.process;

/**
 * Clase que representa un producto en el catálogo.
 * Contiene atributos como el nombre, el costo y el impuesto.
 */

public class Product {

    // Atributos
    private String nombre;    // p.ej., "iPhone 12"
    private double costo;     // p.ej., 799.99
    private double impuesto;  // p.ej., 0.16 (16%)

    // Constructor
    public Product(String nombre, double costo, double impuesto) {
        this.nombre = nombre;
        this.costo = costo;
        this.impuesto = impuesto;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * Calcula el precio final (costo + impuesto).
    *@param costo Costo base del producto
    *@param impuesto Impuesto (por ejemplo, 0.16 para 16%)
     */
    public double calcularPrecioVenta() {
        return costo + (costo * impuesto);
    }

    /**
     * Muestra la información del producto.
     */
    public void mostrarInfo() {
        System.out.println("\nProducto: " + nombre);
        System.out.println("Costo base: $" + costo);
        System.out.println("Impuesto: " + (impuesto * 100) + "%");
        System.out.println("Precio de venta: $" + calcularPrecioVenta());
    }
}