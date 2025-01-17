package edu.liam.proyect.actividades.act1.process;

public class Car {
    private String modelo;
    private String marca;
    private int numeroPuertas;
    private String color;

    /**
     * Constructor que inicializa todos los atributos de un auto y
     * valida que el número de puertas esté dentro del rango correcto.
     *
     * @param modelo       Modelo (o año) del auto
     * @param marca        Marca o fabricante del auto
     * @param numeroPuertas Número de puertas (validado entre 2 y 5)
     * @param color        Color del auto
     */
    public Car(String modelo, String marca, int numeroPuertas, String color) {
        this.modelo = modelo;
        this.marca = marca;
        // Usamos el setter para validar el número de puertas.
        setNumeroPuertas(numeroPuertas);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", color='" + color + '\'' +
                '}';
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * Asigna el número de puertas si está dentro del rango 2-5,
     * de lo contrario, lanza una excepción.
     *
     * @param numeroPuertas Número de puertas
     * @throws IllegalArgumentException si el número de puertas no está entre 2 y 5
     */
    public void setNumeroPuertas(int numeroPuertas) {
        if (numeroPuertas < 2 || numeroPuertas > 5) {
            throw new IllegalArgumentException("El número de puertas válido está entre 2 y 5");
        }
        this.numeroPuertas = numeroPuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
