package T4ejercicios;

import java.util.Scanner;

public class AlternarV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Introduce cadena: ");
	        String tex = sc.nextLine();
	        String inv = "";
	        int a = 0;
	        char inicio;
	        char fin;
	        
	      
	        
	        
		for (int i=0; i<tex.length()/2;i++) {
			inicio=tex.charAt(i);
			fin=tex.charAt(tex.length()-1-i);
			inv+=tex.valueOf(inicio) + String.valueOf(fin);
			
		}
		
	
		System.out.print(inv);
	}

}