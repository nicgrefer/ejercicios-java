package ejercicios.amarres;

import java.time.LocalDate;
import java.time.Month;

public class Aplicacion {

    public static void main(String[] args) {

        Velero velero = new Velero("1234AAA", 100, 2000, 4);
        Yate yate = new Yate("9000CCC", 300, 2005, 1500, 5);

        Cliente1 luis = new Cliente1("11111111A", "Luis");
        Amarre amarre1 = new Amarre("A1");
        amarre1.asignarBarco(velero);
        Alquiler a1 = new Alquiler(luis, LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 5), amarre1, velero);
        infoAlquiler(a1);
        System.out.println("Total a pagar: " + alquiler(a1));

        Cliente1 maria = new Cliente1("22222222B", "María");
        Amarre amarre2 = new Amarre("B2");
        amarre2.asignarBarco(yate);
        Alquiler a2 = new Alquiler(maria, LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 5), amarre2, yate);
        infoAlquiler(a2);
        System.out.println("Total a pagar: " + alquiler(a2));

    }

    public static double alquiler(Alquiler a) {
        return a.totalAlquiler();
    }
    
    public static void infoAlquiler(Alquiler a){
        System.out.println("\nInformación del alquiler: \n" + a.toString());
    }
}
