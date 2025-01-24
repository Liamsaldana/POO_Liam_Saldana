package edu.liam.proyect.actividades.retos.reto4;

public class Rootmath {
    
    /**
     * Recibe un arreglo de enteros y retorna un nuevo arreglo
     * con cada valor elevado al cuadrado.
     */
    public static int[] squareArray(int[] arr) {
        int[] resultado = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultado[i] = arr[i] * arr[i];
        }
        return resultado;
    }
}
