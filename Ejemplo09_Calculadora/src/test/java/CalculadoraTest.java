import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	 Calculadora calc;
	@BeforeAll
	static void inicializacion() {

		System.out.println("Iniciado");	
		try {
			CalculadoraTest calc = new CalculadoraTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterAll
	static void finalizacion() {
		System.out.println("Finalizado");
	}
	
	@Test
	void testSumar() {
		//fail("Not yet implemented");
		Calculadora calc = new Calculadora();
		assertEquals(4, calc.sumar(2, 2)); // aberigua si 2 + 2 es igual a 4 ->  Lubreria implementada
		assertEquals(100, calc.sumar(10, 90)); 
		
		assertNotEquals(10, calc.sumar(5, 6)); // 5 + 5 no es igual a 10);
		assertTrue(10==calc.sumar(5, 5)); // 5 + 5 es igual a 10);
		assertFalse(11==calc.sumar(5, 5)); // 5 + 5 no es igual a 11);
	}

	
	@Test
	void testRestar() {
		//fail("Not yet implemented");
		
		Calculadora calc2 = new Calculadora();
		assertEquals(5, calc2.restar(9, 4));
		assertEquals(0, calc2.restar(2, 2));
		assertNotEquals(1, calc2.restar(8, 3));
		assertTrue(20==calc2.restar(40, 20));
		assertFalse(10== calc2.restar(40, 10));
		
	}
	
	
}
