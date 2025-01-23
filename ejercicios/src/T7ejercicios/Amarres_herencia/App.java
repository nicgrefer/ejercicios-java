package T7ejercicios.Amarres_herencia;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cerar objetos de cada clase y mostrarlos por pantalla
		
		Barco barco = new Barco("1234", 12.5, 2000);
        System.out.println(barco);
        
        System.out.println("--------------------");
        
        Veleros velero = new Veleros("1235", 10.5, 2001, 2);
        System.out.println(velero);
		
        System.out.println("--------------------");
        
        MotoDeportiva moto = new MotoDeportiva("1236", 5.5, 2002, 200);
        System.out.println(moto);
        
        System.out.println("--------------------");
        
        YateLujo yate = new YateLujo("1237", 15.5, 2003, 300, 4);
        System.out.println(yate);
		
        
        System.out.println("--------------------");
        

        Alquiler alquiler = new Alquiler("pepe", "12345678A", LocalDate.of(2025, 1, 20), LocalDate.of(2025, 1, 23), 1, velero);
        System.out.println(alquiler);
        
	}

}
