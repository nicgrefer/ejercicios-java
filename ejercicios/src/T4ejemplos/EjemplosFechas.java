package T4ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.util.Locale;

public class EjemplosFechas {

	public static void main(String[] args) {
		

		//Obtener fecha y hora del sistema
		LocalDate hoy = LocalDate.now();
		System.out.println("Hoy es: " + hoy);
		LocalTime hora= LocalTime.now();
		System.out.println("con hora de : " + hora);
		LocalDateTime hoyAhora = LocalDateTime.now();
		System.out.println("La fecha y ora es : " + hoyAhora);
		
		//Crear fechas concretas
		
		LocalDate Navidad=LocalDate.of(2024,12,25);
		LocalDate Nochebuena=LocalDate.of(2024, Month.DECEMBER, 24);
		System.out.println("navidas es "+ Navidad);
		System.out.println("nochebuena es "+ Nochebuena);
		//
		LocalDate navidad2=LocalDate.of(Year.now().getValue(), 12, 24);
		
	}

}
