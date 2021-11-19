package Ejercicio3;

import javax.swing.*;

public class Circulo {
    public static void main(String[] args) {

        String texto= JOptionPane.showInputDialog("Introduce un radio");
        double radio=Double.parseDouble(texto);//Pasamos el String a double

        double area=Math.PI*Math.pow(radio, 2);//Formula area circulo

        System.out.println("El area del circulo es "+area);
    }



}
