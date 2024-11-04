package T4ejercicios;

import java.util.Scanner;

public class DNI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Introduce el DNI con la letra: ");
            String dni = sc.nextLine();

            if (dni.length() == 9) {  // Verificamos que la longitud sea 9
                char letra = Character.toUpperCase(dni.charAt(8));  // Último carácter

                // Comprobamos que la letra esté en el rango 'A' - 'Z'
                if (letra >= 'A' && letra <= 'Z') {
                    System.out.println("DNI válido: " + dni);
                    return;  // Salimos del programa si el DNI es válido
                } else {
                    System.err.println("La letra no es válida. Debe ser una letra entre A y Z.");
                }
            } else {
                System.err.println("Valor no válido. El DNI debe tener exactamente 9 caracteres.");
            }
        }
        System.err.println("No se ha introducido un DNI válido en los 3 intentos.");
      
    }
}