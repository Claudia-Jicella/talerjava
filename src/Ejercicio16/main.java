package Ejercicio16;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String nombre;
        int edad;
        char sexo;
        double peso, altura;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Digite la edad: ");
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite el Sexo M-mujer H-hombre: ");
        sexo = scanner.nextLine().toUpperCase(Locale.ROOT).charAt(0);
        System.out.println("Digite el peso actual: ");
        peso = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite la altura en metros: ");
        altura = Double.parseDouble(scanner.nextLine());

        Persona personaUno = new Persona(nombre, edad, sexo, peso, altura);
        Persona personaDos = new Persona(nombre, edad, sexo);
        Persona personaTres = new Persona();

        ImplementarMetodos(personaUno);
        ImplementarMetodos(personaDos);
        ImplementarMetodos(personaTres);

    }

    public static void ImplementarMetodos(Persona persona) {
        int valorImc;

        valorImc = persona.CalcularIMC();
        if (valorImc == -1) {
            System.out.println("La persona esta por debajo del peso establecido");
        } else if (valorImc == 0) {
            System.out.println("El peso es apropiado");
        } else {
            System.out.println("la persona esta con sobrepeso");
        }

        if (persona.EsMayorDeEdad()) {
            System.out.println("la persona es mayor de edad");
        }
        System.out.println(persona.toString());
        System.out.println("------------------------------------------------------------------------\n\n");
    }
}