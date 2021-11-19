package Ejercicio5;

public class While {
    public static void main(String[] args) {

        int num = 0;

        while (100 >= num) {
            if (num % 2 == 0) {
                System.out.println("El numero par es: " + num);
            }
            num++;
        }
        System.out.println("*******************************************");
        num = 0;
        while (100 >= num) {
            if ((num % 2) != 0) {
                System.out.println("El numero inpar es: " + num);
            }
            num++;
        }
    }
}
