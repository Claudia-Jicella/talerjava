package Ejercicio4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class carculoIva {
    static DecimalFormat formatter = new DecimalFormat("#,##0.0#"); //para mostrar los decimales

    public static void main(String[] args) {
        final float IVA = 1.19f; //valor del IVA actual

        System.out.println("Ingrese el precio del producto sin IVA: ");
        Scanner precioProducto = new Scanner(System.in);
        double precio =precioProducto.nextDouble();

        precio= precio * IVA;
        System.out.println("El precio del producto con IVA es: "+ formatter.format(precio));

    }

}
