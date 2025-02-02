package T4ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.Set;

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
		System.out.println(navidad2);
		Navidad=LocalDate.of(LocalDate.now().getYear(), Month.DECEMBER, 25);
		System.out.println(Navidad);
		
		
		LocalDate fecha=LocalDate.ofEpochDay(2500);
		System.out.println(fecha);
		System.out.println(LocalDate.ofYearDay(2024, 364));
		
		//Crear horas concretas
		
		LocalTime hora1=LocalTime.of(11, 40);
		
		//sumar-restar fechas
		
		LocalDate otraFecha=Navidad.plusDays(10);
		System.out.println(otraFecha);
		
System.out.println("-------------------------------------");
		
		// Comprarar fecha
		
		//--> ver si son iguales
		
		System.out.println(Navidad.equals(hoy));
		System.out.println(Navidad.compareTo(hoy));
		
		//--> cual es la mas reciente 
		
		System.out.println(Navidad.isAfter(hoy));
		System.out.println(Navidad.isBefore(hoy));
		
		
		//--> ver la diferencia de dias que hay entre ellas
		
		System.out.print(Period.between(hoy, Navidad).getMonths() + " mes y " );
		System.out.println(Period.between(hoy, Navidad).getDays() + " dias " );
		
		
		
		// Listar zonas horarias disponibles
        Set<String> zonas = ZoneId.getAvailableZoneIds();
        for (String zona : zonas) {
            System.out.println(zona);
        }

        // Definir la zona horaria de Japón
        ZoneId japon = ZoneId.of("Japan");
        ZonedDateTime horaJapon = ZonedDateTime.now(japon);

        // Imprimir la hora actual en Japón
        System.out.println("Hora actual en Japón: " + horaJapon);
		
	}

}
