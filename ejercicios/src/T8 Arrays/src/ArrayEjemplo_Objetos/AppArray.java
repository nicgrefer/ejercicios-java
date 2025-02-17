package ArrayEjemplo_Objetos;

import java.util.Arrays;

public class AppArray {

    // Método que busca una persona por su DNI e imprime el resultado
    public void buscarPorDni(Persona[] arrayPersonas, String dniBuscado) {
        boolean encontrada = false;

        for (Persona persona : arrayPersonas) {
            if (persona != null && persona.getDni().equals(dniBuscado)) {
                System.out.println("Persona encontrada: " + persona);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("No se ha encontrado ninguna persona con el DNI " + dniBuscado);
        }
    }

    // Método que busca la posición de una persona por su DNI
    public int buscarPosicionPorDni(Persona[] arrayPersonas, String dniBuscado) {
        for (int i = 0; i < arrayPersonas.length; i++) {
            if (arrayPersonas[i] != null && arrayPersonas[i].getDni().equals(dniBuscado)) {
                System.out.println("Persona encontrada en la posición: " + i + " -> " + arrayPersonas[i]);
                return i;
            }
        }
        System.out.println("No se ha encontrado ninguna persona con el DNI " + dniBuscado);
        return -1;
    }

    // Método que devuelve un array con las personas mayores de edad (>= 18)
    public Persona[] buscarMayoresEdad(Persona[] arrayPersonas) {
        Persona[] personasMayores = new Persona[arrayPersonas.length];
        int contador = 0;

        for (Persona persona : arrayPersonas) {
            if (persona != null && persona.getEdad() >= 18) {
                personasMayores[contador] = persona;
                contador++;
            }
        }

        // Redimensionamos el array para eliminar los nulos
        return Arrays.copyOf(personasMayores, contador);
    }

    public static void main(String[] args) {

        Persona[] arrayPersonas = new Persona[5];
        AppArray app = new AppArray();
        String dniBuscado = "11145678N";

        // Crear personas
        Persona persona1 = new Persona("Pepe", "Juan", "12345678N", 12);
        Persona persona2 = new Persona("Maria", "Tierra", "11145678N", 18);
        Persona persona3 = new Persona("Marco", "Aurelio", "12388878N", 30);

        // Asignarlas al array
        arrayPersonas[0] = persona1;
        arrayPersonas[1] = persona2;
        arrayPersonas[2] = persona3;

        // Buscar por DNI
        app.buscarPorDni(arrayPersonas, dniBuscado);

        // Buscar posición por DNI
        app.buscarPosicionPorDni(arrayPersonas, dniBuscado);

        // Buscar personas mayores de edad
        Persona[] mayores = app.buscarMayoresEdad(arrayPersonas);
        System.out.println("\nPersonas mayores de edad:");
        for (Persona p : mayores) {
            System.out.println(p);
        }
    }
}
