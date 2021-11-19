package Ejercicio12;

import java.util.Scanner;

public class igualarPalabras {
    private String palabra1;
    private String palabra2;

    public static void main(String[] args) {

        System.out.println("Introduzca La primer Palabra: ");
        Scanner leer = new Scanner(System.in);
        String palabra1 = leer.nextLine();;
        System.out.println("Introduzca la segunda palabra: ");
        String palabra2 = leer.nextLine();

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras Son iguales");
        } else {
            System.out.println("Las palabras No son iguales\n");

            if (palabra1.length() >= palabra2.length()) {
                int i = 0;
                while (i < palabra2.length()) {
                    if (palabra1.substring(i, i + 1).equalsIgnoreCase(palabra2.substring(i, i + 1))) {
                        System.out.println("La Letra " + (i + 1) + " Son iguales en las dos palabras");
                    } else {
                        System.out.println("La Letra " + (i + 1) + " No son iguales en las dos palabras");
                    }
                    i++;
                }
                System.out.println("\n******La difrencia es la siguiente: \n");

                while (i < palabra1.length()) {
                    System.out.println("La palabra "+palabra2 +" no tiene " + (i + 1)+" letras.");
                    i++;
                }
            } else {
                int i = 0;
                while (i < palabra1.length()) {
                    if (palabra1.substring(i, i + 1).equalsIgnoreCase(palabra2.substring(i, i + 1))) {
                        System.out.println("La Letra " + (i + 1) + " Son iguales en las dos palabras");
                    } else {
                        System.out.println("La Letra " + (i + 1) + " No son iguales en las dos palabras");
                    }
                    i++;
                }
                while (i < palabra2.length()) {
                    System.out.println("La palabra " + palabra1 + " no tiene " + (i + 1) + " letras ");
                    i++;
                }

            }
        }

    }
}
