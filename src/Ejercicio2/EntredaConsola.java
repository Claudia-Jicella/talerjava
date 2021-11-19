package Ejercicio2;

import java.util.Scanner;

public class EntredaConsola {
    private static Object String;

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        mayorque();
    }

    private static void mayorque() {
        Scanner leer = new Scanner(System.in); //Metodo Scaner, Entrada por consola de numero 1 y numero 2
        int numero1, numero2;


        System.out.println("Ingrese el Numero 1: ");   //
        numero1 = leer.nextInt();

        System.out.println("Ingrese Numero 2: ");
        numero2 = leer.nextInt();

        if (numero1 == numero2) {
            System.out.println("Numero 1 Y Numero 2 son Iguales"); //Si los numeros son iguales
        } else if (numero1 > numero2)
            System.out.println("El mayor es: " + numero1); //Si el numero 1 es mayor que numero 2
        else
            System.out.println("El mayor es: " + numero2); //Si el numero 2 es mayor que numero 1
        if (numero1 < numero2)
            System.out.println("El menor es: " + numero1); //Si el numero 1 es menor que numero 2
        else
            System.out.println("El menor es: " + numero2); //Si el numero 2 es menor que numero 1
    }

}
