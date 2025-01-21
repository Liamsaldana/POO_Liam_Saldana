package edu.liam.proyect.actividades.retos;

//******************************************************************************
// Implementar la función reverseString que reciba una cadena de caracteres como
// parámetro y devuelva la cadena invertida.
//******************************************************************************

public class reto1 {
    public static void main(String[] args) {
        String original = "Hola Mundo";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}

