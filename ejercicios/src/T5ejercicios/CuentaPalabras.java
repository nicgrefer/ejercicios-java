package T5ejercicios;

import java.util.Scanner;

public class CuentaPalabras {

    // Programa que calcula las palabras de una frase introducida por teclado
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaPalabras app = new CuentaPalabras();

        System.out.print("Introduce una cadena con varias palabras: ");
        String cadena = sc.nextLine();
        int palabras = app.contador(cadena);

        System.out.println("El número de palabras es: " + palabras);

    }

    // Método que devuelve el nº de palabras sin usar isWhitespace
    public int contador(String frase) {
        int contador = 0;
        boolean esPalabra = false;
        int longitud = frase.length();

        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == ' ') {
                if (esPalabra) {
                    contador++;
                    esPalabra = false;
                }
            } else {
                esPalabra = true;
            }
        }

        // Contar la última palabra si la frase no termina con un espacio
        if (esPalabra) {
            contador++;
        }

        return contador;
    }
}
