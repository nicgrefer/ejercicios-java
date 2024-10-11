package T3ejemplos;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Escriba cualquier numero: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int suma=0;
        for(int i=1;i<=num;i++){
            int aux=num%i;
           
            if(aux==0){
                suma++;
            }
        }
        if(suma<=2){
            System.out.println("Es primo.");
        }else{
            System.out.println("No es primo.");
        }

		
		
	}

}
