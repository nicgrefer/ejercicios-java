package ArrayEjemplo03_BusquedaBinaria;

import ArrayEjemplo02_Ordenación.*;
import java.util.Arrays;
import java.util.Comparator;

public class AppArray {


    public static void main(String[] args) {

        Persona[] arrayPersonas = new Persona[5];
        AppArray app = new AppArray();
        String dniBuscado = "11145678N";

        // Crear personas
        Persona persona1 = new Persona("Pepe", "Perez", "11111111a", 20);
        Persona persona2 = new Persona("Maria", "Tierra", "22222222b", 15);
        Persona persona3 = new Persona("Marco", "Aurelio", "33333333c", 42);
        Persona persona4 = new Persona("Luis", "Miguel", "44444444d", 18);
        Persona persona5 = new Persona("Tio", "Pio", "55555555e", 32);

        // Asignarlas al array
        arrayPersonas[0] = persona1;
        arrayPersonas[1] = persona2;
        arrayPersonas[2] = persona3;
        arrayPersonas[3] = persona4;
        arrayPersonas[4] = persona5;


        System.out.println(Arrays.toString(arrayPersonas));        
        
         // Buscar una persona por apellidos usando el algoritmo binary search
        Arrays.sort(arrayPersonas, Comparator.comparing(Persona::getDni));
        Persona key = new Persona(null, null, "22222222b", null);
        int resultado = Arrays.binarySearch(arrayPersonas, key, Comparator.comparing(Persona::getDni));

        if (resultado >= 0) {
            System.out.println("Persona encontrada: " + arrayPersonas[resultado]);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
}