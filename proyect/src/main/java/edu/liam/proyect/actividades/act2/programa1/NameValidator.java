package edu.liam.proyect.actividades.act2.programa1;

public class NameValidator {

    /**
     * Valida si el nombre ingresado coincide con alguno de Data.NOMBRES_VALIDOS.
     * Sensible a mayúsculas y minúsculas.
     */
    public static void validateName(String nombre) {
        boolean encontrado = false;

        for (String nombreValido : Data.NOMBRES_VALIDOS) {
            if (nombre.equals(nombreValido)) {
                encontrado = true;
                mostrarSaludo(nombre);
                break; // salimos del for, ya que encontramos coincidencia
            }
        }

        if (!encontrado) {
            System.out.println("No reconozco tu nombre: " + nombre);
        }
    }

    /**
     * Muestra un mensaje personalizado según el nombre encontrado.
     */
    private static void mostrarSaludo(String nombre) {
        switch (nombre) {
            case "Liam" -> System.out.println("Hola, Admin Liam. ¡Bienvenido!");
            case "Jesus"   -> System.out.println("Hola, Admin Jesus. ¿Cómo estás?");
            default      -> System.out.println("Hola, " + nombre + ". ¡Gusto en verte!");
        }
    }
}
