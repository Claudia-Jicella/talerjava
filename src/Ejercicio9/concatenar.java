package Ejercicio9;

import java.util.Scanner;

public class concatenar {
    public static void main(String[] args) {

        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String mensajeConsola;

        System.out.println("Ingrese el mensaje deseado: ");

        Scanner leer = new Scanner(System.in);
        mensajeConsola = leer.nextLine();

        texto = texto.replace('a', 'e');
        System.out.println(texto + " " + mensajeConsola);
    }
}