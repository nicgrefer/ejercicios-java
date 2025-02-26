import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class test {

    static Utilidades util1;

    @BeforeAll
    static void inicializacion() {
        System.out.println("inicializando");
        util1 = new Utilidades();
    }

    @AfterAll
    static void finalizacion() {
        System.out.println("finalizando y cerrando recursos");
        util1 = null;
        System.gc();
    }

    @DisplayName("Test de la multiplicación de fracciones")
    @ParameterizedTest
    @CsvFileSource(resources = "excel_fracciones.csv", numLinesToSkip = 1)
    void testMultiplicar(int num1, int denom1, int num2, int denom2, int resultadoNumerador, int resultadoDenominador) {
        // Obtenemos el resultado de la multiplicación de fracciones
        Fraccion resultado = util1.multiplicar(new Fraccion(num1, denom1), new Fraccion(num2, denom2));

        // Verificamos que el numerador y denominador sean correctos
        assertEquals(resultado.getNumerador(), resultadoNumerador);
        assertEquals(resultado.getDenominador(), resultadoDenominador);
        assertTrue(resultado.getNumerador() ==resultadoNumerador);
        assertTrue(resultado.getDenominador() == resultadoDenominador);
        assertNotEquals(resultado.getDenominador(), 0);
        assertEquals(resultado,util1.multiplicar(new Fraccion(num1, denom1), new Fraccion(num2, denom2)));
    }
}


	
