package edu.liam.proyect.actividades.act2.programa2;

public class NumGenerator {

    /**
     * Genera un arreglo con los números pares del 2 al 100.
     * @return un int[] con los números pares.
     * @throws IllegalArgumentException si el número de pares es negativo
     * @throws IllegalArgumentException si el número de pares es mayor que 50
     * @throws IllegalArgumentException si el número de pares es cero
     * 
     */
    public static int[] generarPares2a100() {
        // Hay 50 pares entre 2 y 100 inclusive
        int[] pares = new int[50];
        int index = 0;

        for (int num = 2; num <= 100; num += 2) {
            pares[index] = num;
            index++;
        }

        return pares;
    }

    /**
     * Imprime los números pares en una sola línea.
     * @param pares el arreglo de números pares
     */
    public static void imprimirPares(int[] pares) {
        System.out.println("Números pares del 2 al 100:");
        for (int p : pares) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
