import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UtilidadesTest {

	static Utilidades utilidades ;
	@DisplayName("Test inicial")
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		utilidades= new Utilidades();
	}

	@DisplayName("Test de ordenar")
	@Test
	void testOrdenar() {
		int datosIniciales[]=new int[] {5,3,1,4,2};
		int ordenado[]=utilidades.ordenar(datosIniciales);
		
		
		assertArrayEquals(new int[] {1,2,3,4,5}, ordenado);
		
		assertTrue(ordenado(ordenado));
		
	}
	
	boolean ordenado(int[] datos) {
		
		boolean ordenado=true;
		for (int i = 0; i < datos.length-1; i++) {
			if(datos[i]>datos[i+1])
				ordenado=false;
		}
		
		return ordenado;
	}

}
