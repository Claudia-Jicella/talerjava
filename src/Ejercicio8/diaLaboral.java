package Ejercicio8;

import javax.swing.*;

public class diaLaboral {
    public static void main(String[] args) {
        String dia= JOptionPane.showInputDialog("Digita un dia de la semana");

        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");

                break;
            case "sabado":
            case "domingo":
                System.out.println("No es un Dia Laboral");

            default:
                System.out.println("Digita un dia en la semana");
        }
    }
}
