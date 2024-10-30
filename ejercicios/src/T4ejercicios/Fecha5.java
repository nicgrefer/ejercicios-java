package T4ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fecha5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Introduzca la fecha de la factura formato dd/mm/yyyy porfavor");
            String facturafechauser = sc.next(); //Guarda la fecha de la factura dada por el usuario

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//creo el formateo formato dd/MM/yyyy
            LocalDate facturafecha = LocalDate.parse(facturafechauser, dtf); //Parseo el string a LocalDate
            System.out.println("Por favor, indique el importe");
            int importepago = sc.nextInt();//recojo el importe dado por el usuario

            System.out.println("Por favor, ahora eliga el termino de pago que quiera elegir");
            System.out.println("Marque 1 si quiere que sea en 7 dias");
            System.out.println("Marque 2 si quiere que sea en 14 dias");
            System.out.println("Marque 3 si quiere que sea en tres pagos, uno cada mes");

            int terminopago = sc.nextInt();//recojo el termino de pago que el usuario elige

            switch (terminopago) {// diferencio los 3 tipos diferentes de terminos de pago
                case 1:

                    System.out.println("Su fecha de vto es el " + dtf.format(facturafecha.plusDays(7)) + " y tendra que pagar " + importepago + " euros");//sumo 7 dias e imprimo
                    break;

                case 2:
                    System.out.println("Su fecha de vto es el " + dtf.format(facturafecha.plusDays(14)) + " y tendra que pagar " + importepago + " euros");//sumo 14 dias e imprimo
                    break;

                case 3:
                    System.out.println("Por favor, introduzca la distribucion de pagos que quieras realizar y que sumando los 3 llegue a 100");
                    System.out.println("Cuanto porcentaje quieres pagar el primer mes");
                    int distribucionpagos1 = sc.nextInt();//primer mes
                    System.out.println("Cuanto porcentaje quieres pagar el segundo mes");
                    int distribucionpagos2 = sc.nextInt();//segundo mes
                    System.out.println("Cuanto porcentaje quieres pagar el tercer mes");
                    int distribucionpagos3 = sc.nextInt();//tercer mes
                    if (distribucionpagos1 + distribucionpagos2 + distribucionpagos3 != 100) {//si la suma no es igual a 100 salta el error que introduje
                        System.err.println("Porcentajes mal introducidos");
                    } else if (distribucionpagos1 + distribucionpagos2 + distribucionpagos3 == 100) {//si si da 100 se realiza

                        System.out.println("Vto1: " + dtf.format(facturafecha.plusMonths(1)) + " Importe: " + importepago * distribucionpagos1 / 100
                                + " euros" + "\nVto2: " + dtf.format(facturafecha.plusMonths(2)) + " Importe: " + importepago * distribucionpagos2 / 100
                                + " euros" + "\nVto3: " + dtf.format(facturafecha.plusMonths(3)) + " Importe: " + importepago * distribucionpagos3 / 100 + " euros");

                    }
                    break;
                default:
                    System.err.println("Por favor, introduzca un valor del 1 al 3");//si no ha metido un numero del 1 al 3, saco error
                    break;

            }
        } catch (DateTimeParseException | InputMismatchException er) {//para que no me pete el programa, creo un error personalizado
            System.err.println("Por favor, introduzca los datos que se le piden");
        }
    }

}
