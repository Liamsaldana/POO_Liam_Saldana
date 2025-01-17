package edu.liam.proyect.actividades.act1.process;

import java.util.ArrayList;

public class StockManager {

    private ArrayList<Car> stock;

    public StockManager() {
        this.stock = new ArrayList<>();
    }

    /**
     * Genera un nuevo objeto con la información de un auto y lo agrega
     * al catálogo de la aplicación.
     *
     * @param modelo       el modelo del auto (por ejemplo, año)
     * @param marca        empresa productora del auto
     * @param numeroPuertas número de puertas del auto
     * @param color        color del auto (por ejemplo, blanco, gris, etc.)
     */
    public void addCar(String modelo, String marca, int numeroPuertas, String color) {
        Car car = new Car(modelo, marca, numeroPuertas, color);
        stock.add(car);
    }

    public void printStock() {
        System.out.print("El catálogo actual es: ");
        System.out.println(stock);
    }
}
