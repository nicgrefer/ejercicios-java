package clasesextra;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ejer3();
		
	}

	public static void ejer1() {
        int i = 0;
        int j;
        while (i < 10) {
            j = 0; // Reiniciar j en cada iteración de i
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void ejer2() {
        int dias = 1;
        while (dias <= 31) {
            System.out.println(dias);
            dias++;
        }
    }

	public static void ejer3() {
		Scanner teclado=new Scanner(System.in);
		int aux=1;
		int numero=1;
		while(numero!=0) {
			System.out.print("Dame el numero del mes ");
			numero=teclado.nextInt();
			int par = (numero%2==0)? 30:31;
			while (aux<=par) {
				System.out.println(aux);
				aux++;
				
			}
		
		}
	}
	
	
}
