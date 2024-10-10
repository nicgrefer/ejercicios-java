package T3ejemplos;

import java.util.Random;
import java.util.Scanner;

public class ejemploBucles2 {

	public static void main(String[] args) {
		ejer6();
	}
	
	
	public static void ejer1() { // Mostrar los numeros que hay entre el 1 y "N" 
		Scanner teclado=new Scanner(System.in);
		int n=0;
		System.out.print("Dame un número entero  ");
		int num=teclado.nextInt();
		if (n>=0) {
			while(num>=n) {
				System.out.println(num);
				num--;
				
			}
		}else {
			while(num<n) {
				System.out.println(num);
				num++;
				
			}
		}
	}
	
	public static void ejer2() { //Mostrar los numeros que hay entre 2 balores (N y M)
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame un número entero ");
		int num1=teclado.nextInt();
		System.out.println("Dame otro número entero ");
		int num2=teclado.nextInt();
		
		if (num1<num2) {
			while (num1<=num2) {
				System.out.println(num1);
				num1++;
				
				
			}
			
		}else{
			while(num2<=num1) {
				System.out.println(num2);
				num2++;
				
			}
			
		}
		
	}	
	
	
	public static void ejer3() { //Mostrar los pares que hay entre el 1 y el 100, contarlos y sumarlos
		int inicio=1;
		int fin=100;
		int aux=0;
		int par=0;
		while(inicio<=fin) {
			inicio++;
			if (inicio%2==0) {
				aux++;
				par=par+inicio;
				System.out.println("El " + inicio + " es par");
			}
			
		}
		System.out.println("Llebamos " + aux +  " pares y la suma entre ellos es " + par);
	}

	
	public static void ejer4() {//mostrar la  suma de los ciadrados de los numeros impares entre 1-100
		
		int aux=0;
		int suma=0;
		while(aux<100) {
			aux++;
			if (aux%2!=0) {
				suma=(int) (suma+Math.pow(aux, 2));
				System.out.println("    " + aux);
				
			}
		}
	
		System.out.println(" ---------");
		System.out.println("| " + suma + "  |" );
		System.out.println(" ---------");
		
	}
	
	
	
	
	public static void ejer5() {//genere 25 aleatorios entre 1-100 y diga cuantos pares/impares salieron
	
		        int i = 0;
		        int par = 0;
		        int impar = 0;
		        Random aleatorio = new Random();

		        while (i < 25) { // Cambié "<= a"  para generar exactamente 25 números
		            int numeroAleatorio = aleatorio.nextInt(100) + 1; // Genera un número entre 1 y 100
		            i++;
		            if (numeroAleatorio % 2 == 0) {
		                par++;
		            } else {
		                impar++;
		            }
		        }

		        System.out.println("Han salido " + par + " pares");
		        System.out.println("Y " + impar + " impares");
	}

	
	public static void ejer6() {//muestre y cuente multipols de 2/3 entre 1-100
		int m2=0;
		int m3=0;
		for (int i=1; i<100; i++) {
			if (i%2==0) {
				System.out.println(i + " es multiplo de 2");
				m2++;
			} if (i%3==0) {
				System.out.println(i + " es multiplo de 3");
				m3++;
			}
			
		}
		System.out.print("Son "+ m2 + " multiplos de 2 y " + m3 +" multiplos de 3");
		
		
	}
	
	public static void ejer7() {//programa con menus (4 opciones(A,B,C,D) y una de salida(Q)) 
								//si no estaen el menu ponga error. Se repetira en bucle 
								//asta que no den a salir
		char aux = ' ';
        Scanner teclado = new Scanner(System.in);

        while (aux != 'q') {
        	 System.out.println("-----------");
            System.out.println(" Opción A");
            System.out.println(" Opción B");
            System.out.println(" Opción C");
            System.out.println(" Opción D");
            System.out.println(" Salir Q");
            System.out.println("-----------");
            aux = teclado.next().toLowerCase().charAt(0);

            switch (aux) {
                case 'a':
                    System.out.println("Estás en la opción A");
                    break;
                case 'b':
                    System.out.println("Estás en la opción B");
                    break;
                case 'c':
                    System.out.println("Estás en la opción C");
                    break;
                case 'd':
                    System.out.println("Estás en la opción D");
                    break;
                case 'q':
                    System.out.println("Estás fuera");
                    break;
                default:
                    System.out.println("Error: opción no válida");
                    break;
            }
        }
        
    }

	
	

	
}
