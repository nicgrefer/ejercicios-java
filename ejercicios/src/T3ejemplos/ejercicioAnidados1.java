package T3ejemplos;

import java.util.Scanner;

public class ejercicioAnidados1 {

    public static void main(String[] args) {

        int base = 0;
        int altura = 0;
        // Bucle de validación
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Base: ");
            base = teclado.nextInt();
            System.out.print("Altura: ");
            altura = teclado.nextInt();
            if ((base < 1 || base > 20) || (altura < 1 || altura > 20)) {
                System.err.println("Error, valores incorrectos");
            }
        } while ((base < 1 || base > 20) || (altura < 1 || altura > 20));
        
        // Procedemos a pintar
        for (int i = 0; i < altura; i++) { // altura
            for (int j = 0; j < base; j++) { // base
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
