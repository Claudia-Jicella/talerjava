package Ejercicio10;

import javax.swing.*;

public class elimnaEspacios {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Ingresa una frase o una oracion",
                "Ingresa,", JOptionPane.INFORMATION_MESSAGE);

        String texto_sin_espacios = ""; //Almacenamos el texto
        char textoActual;
        for (int i = 0; i < texto.length(); i++) {    //recorro el array
            textoActual = texto.charAt(i);
            if (textoActual != ' ') {
                texto_sin_espacios += String.valueOf(textoActual);
            }

        }
        JOptionPane.showInputDialog(null, "La frase sin espacios es: ",
                " " + texto_sin_espacios);
    }

}
