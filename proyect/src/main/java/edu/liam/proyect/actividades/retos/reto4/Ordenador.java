package edu.liam.proyect.actividades.retos.reto4;

import java.util.Arrays;

public class Ordenador {

    /**
     * Recibe un arreglo de enteros y lo ordena de menor a mayor.
     * Retorna el mismo arreglo ya ordenado.
     */
    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr); // ordena in-place
        return arr;
    }
}