package Ejercicio6;

public class For {
    public static void main(String[] args) {
        int x = 0;
        for (x = 0; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println("El numero par es: " + x);
            }
            x++;
        }
        System.out.println("********************************************************");
        for (x = 0; x <= 100; x++) {
            if ((x % 2) != 0) {
                System.out.println("El numero inpar es: " + x);
            }
        }
    }

}
