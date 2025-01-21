package T7ejercicios.Empleado_herencia;

import java.time.LocalDate;
import java.time.Month;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpleadoFijo ef = new EmpleadoFijo("Juan", "Perez", "12345678N", LocalDate.of(2024, Month.MARCH, 21), 1500, 100);
		System.out.println(ef);
		
		System.out.println("Sueldo: "+ef.calcularSueldo());
		
		System.out.println("-------------------------------------------------");
		
		Temporal et = new Temporal("Maria", "Gomez", "87654321M", LocalDate.of(2024, Month.MARCH, 21), LocalDate.of(2024, Month.MARCH, 21));
		System.out.println(et);
		
	}

}
