package ejercicios;

import java.util.Scanner;

public class MiNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("primera nota (0-100):");
        int a = sc.nextInt();
        System.out.println("segunda nota (0-100)");
        int b = sc.nextInt();
        System.out.println("tercera nota (0-100):");
        int c = sc.nextInt();
        System.out.println("cuarta nota (0-100):");
        int d = sc.nextInt();
        
        if ((a<0||a>100)||(b<0||d>100)||(c<0||c>100)||(d<0||d>100)) {
        	
        	System.out.println("Error, notas fuera de rango. ");
        	System.out.println("Vuelba a intentarlo");
        }else {
        
        	int nota = a + b + c + d;
        	double media = nota / 100.0;
        	
        	if ((media > 100) && (media < 0)) {
        		System.err.println("valor no valido");
        	} else if ((media >= 90) && (media < 100)) {
        		System.out.println("calificación: A");
        	} else if ((media >= 80) && (media < 90)) {
        		System.out.println("calificacion: B");
        	} else if ((media >= 70) && (media < 80)) {
        		System.out.println("calificacion: C");
        	} else if ((media >= 60) && (media < 70)) {
        		System.out.println("calificacion: D");
        	} else {
        		System.out.println("calificación: E");
        	}
        }
    }
    
}
