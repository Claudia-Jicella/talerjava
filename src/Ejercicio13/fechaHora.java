package Ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class fechaHora {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La Fecha y la Hora Actual en formato (AAAA/MM/DD) (HH:MM:SS) es = \n"
                +dtf.format(LocalDateTime.now()));
    }
}
