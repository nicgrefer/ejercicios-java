package T4ejercicios;

import java.util.Scanner;

public class MasLarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Numero maximo de letras encontrado(max)
        int max = 0;
        // Solucion, cadena mas larga encontrada(sol)
        String sol = "";
        
        // Objeto para la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // String que va a introducir el suuario en cada iteracion
        String frase;
        do{
            System.out.print("Introduce una frase: ");
            frase = sc.nextLine();
            if(frase.length() > max){
                max = frase.length();
                sol = frase;
            }
        } while(!frase.isEmpty());
        System.out.println("La frase mas larga es (" + sol + ")Con una cantidad de " + max + " letras");
		
	}
}

