package ArrayEjemplo02_Ordenación;

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

        // Asignarlas al array
        arrayPersonas[0] = persona1;
        arrayPersonas[1] = persona2;
        arrayPersonas[2] = persona3;

        
        Arrays.sort(arrayPersonas,0,3);
        System.out.println(Arrays.toString(arrayPersonas));        
        
        // Ahora ordenamos el array por edad ->orden total 
        Arrays.sort(arrayPersonas, 0,3,Comparator.comparingInt(Persona::getEdad));
        
        // Ordenacion por dni (orden total)
        Arrays.sort(arrayPersonas,0,3,Comparator.comparing(Persona::getDni));
        System.out.println(Arrays.toString(arrayPersonas));
        
        // Ahora lo mismo pero descendente
        Arrays.sort(arrayPersonas,0,3,Comparator.comparing(Persona::getApellidos).reversed());
        System.out.println(Arrays.toString(arrayPersonas));
    }
}
