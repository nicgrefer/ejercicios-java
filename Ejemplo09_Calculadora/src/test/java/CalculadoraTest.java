import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvFileSources;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
	
	@AfterAll // Todos lo ALL son estaticos
	static void finalizacion() {
		System.out.println("Finalizado");
	}
	
	@AfterEach
	void ejecutaDespues() {
		System.out.println("Despues de cada test");
	}
	@BeforeEach
	void ejecutaAntes() {
		System.out.println("Antes de cada test");
	}
	@DisplayName("Test de la suma")
	@Test
	@ParameterizedTest
	@CsvSource ({"2,2,4", "10,90,100", "5,6,11", "5,5,10"})
	 @CsvFileSource(resources = "/datos_test.csv", numLinesToSkip = 1)
	void testSumar(int sumando1, int sumando2, int resultado) {
		//fail("Not yet implemented");
	Calculadora c1 = new Calculadora();
//		assertEquals(4, calc.sumar(2, 2)); // aberigua si 2 + 2 es igual a 4 ->  Lubreria implementada
//		assertEquals(100, calc.sumar(10, 90)); 
//		
//		assertNotEquals(10, calc.sumar(5, 6)); // 5 + 5 no es igual a 10);
//		assertTrue(10==calc.sumar(5, 5)); // 5 + 5 es igual a 10);
//		assertFalse(11==calc.sumar(5, 5)); // 5 + 5 no es igual a 11);
		System.out.println("Test de la suma");
		assertEquals(resultado,	c1.sumar(sumando1, sumando2));
		assertNotEquals(resultado+1, c1.sumar(sumando1, sumando2));
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
