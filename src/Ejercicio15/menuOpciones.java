package Ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menuOpciones {
    public static void main(String[] args) {

        System.out.println("\n******** GESTION CINEMATOGRÁFICA ********\n");
        System.out.println("---BIENVENIDO AL MENÚ---\n");
        Scanner leer = new Scanner(System.in);

        Boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1-NUEVO ACTOR: " + "\n2-BUSCAR ACTOR: " + "\n3-ELIMINAR ACTOR: " + "\n4-MODIFICAR ACTOR:"
                    + "\n5-VER TODOS LOS ACTORES: " + "\n6-VER PELICULAS DE LOS ACTORES: " + "\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES: "
                    + "\n8-SALIR: ");

            try {
                System.out.println("\nEscoge la opcion que deseas: \n");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:System.out.println("Escogiste la opcion 1\n");break;
                    case 2:System.out.println("Escogiste la opcion 2\n");break;
                    case 3:System.out.println("Escogiste la opcion 3\n");break;
                    case 4:System.out.println("Escogiste la opcion 4\n");break;
                    case 5:System.out.println("Escogiste la opcion 5\n");break;
                    case 6:System.out.println("Escogiste la opcion 6\n");break;
                    case 7:System.out.println("Escogiste la opcion 7\n");break;
                    case 8:salir = true;break;
                    default:
                        System.out.println("¡¡¡¡¡¡¡¡¡DEBES DIGITAR UN NUMERO ENTRE 1 y 8!!!!!!!!!\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("!!!!!!!!!DEBES DIGITAR UN NUMERO¡¡¡¡¡¡¡¡¡\n");
                leer.next();
            }
        }
        System.out.println("¡¡¡¡¡¡¡SALISTE DEL MENÚ; GRACIAS POR TU VISITA!!!!!!!");
    }
}
