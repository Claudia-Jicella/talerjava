package Ejercicio11;

import java.util.Scanner;

public class algoritmos {
    public static void main(String[] args) {

        String mensajeConsola = null;
        String longitud= null;
        String vocales = "aeiou";
        int contador[] = {0, 0, 0, 0, 0};
        String contar = null;

        System.out.println("Ingrese una frase: ");
        Scanner leer = new Scanner(System.in);
        mensajeConsola = leer.nextLine();

        int length = mensajeConsola.length();

        System.out.println("La longitud de la frase es: " + mensajeConsola.length());

        // recorremos la cadena recibida letra a letra

        for (int i = 0; i < mensajeConsola.length(); i++)
        {
            // recorremos las vocales para comparar con cada una de las letras
            for (int j = 0; j < vocales.length(); j++) {

                if (mensajeConsola.charAt(i) == vocales.charAt(j)) {
                    // aumentamos el contador para la vocal encontrada
                    contador[j]++;
                }
            }
        }
        for (int i = 0; i <5; i++) {
            System.out.println("Aparece la letra " + vocales.charAt(i) + ": " + contador[i] + " veces");
        }
    }
}
