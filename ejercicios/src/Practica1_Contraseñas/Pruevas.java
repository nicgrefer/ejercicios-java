package Practica1_Contraseñas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Pruevas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //fecha nacimiento
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha=null;
      		do {
      			System.out.println("Introduce su fecha de nacimiento: ");
          		String fiechaNacimiento =sc.next();
          		
          		
          	  try {
                  // Comprobar si lo introducido coincide con lo pedido(con la plantilla)
                   fecha = LocalDate.parse(fiechaNacimiento, format);

                
              } catch (DateTimeParseException e) {//Si introduce fecha incorrecta ERR
                  System.err.println("Formato de fecha no válidotiene que ser dd/mm/yyyy");
              }
      		}while (fecha==null);
      		
    }
}
