package Ejercicio7;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

        int numero;
        Scanner leer= new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero mayor que 0: ");
            numero=leer.nextInt();
        }while (numero<0);
        System.out.println("El numero es: "+numero);
    }
}
