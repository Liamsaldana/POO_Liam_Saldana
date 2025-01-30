package edu.liam.proyect.actividades.retos.reto4;

public class SortedSquaresProcessor {

    /**
     * Recibe un arreglo ORDENADO (puede contener negativos, cero, positivos),
     * calcula el cuadrado de cada elemento y retorna un nuevo arreglo ordenado.
     * 
     * Utiliza el enfoque de dos punteros para lograr O(n).
     */
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] resultado = new int[n];

        int left = 0;            // Apuntador al inicio
        int right = n - 1;       // Apuntador al final
        int index = n - 1;       // Llenamos el resultado desde el final hacia delante

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                resultado[index] = leftSquare;
                left++;
            } else {
                resultado[index] = rightSquare;
                right--;
            }
            index--;
        }

        return resultado;
    }