package ejercicios;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe una letra para saber si es una vocal: ");
        char vocal = teclado.next().toLowerCase().charAt(0);
        
        switch (vocal) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Es una vocal");
            default -> System.out.println("No es una vocal");
        }
		
	}

}
