package Ejercicio14;

import java.util.Scanner;

public class numeros {

    public static void main(String[] args) {

        int numero;

        System.out.println("Digite un numero del 1 al 1000 = ");
        Scanner leerNumero = new Scanner(System.in);
        numero = leerNumero.nextInt();
        System.out.println("El numero digitado es = " + numero);
        System.out.println("\nLos numeros de 2 en 2 hasta el 1000 son = \n");

        for (int x = numero; x <= 1000; x += 2) {
            System.out.println("El Numero es = " + x);
        }
        numero++;
    }
}
