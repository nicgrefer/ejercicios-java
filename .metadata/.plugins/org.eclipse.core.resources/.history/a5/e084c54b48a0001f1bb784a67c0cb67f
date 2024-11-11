package T5ejercicios;

import java.util.Scanner;

public class Palindromo {

	// Crea un programa que comprueba si un palabra es palindromo
	// ej: seres, oro, somos ,oso ....
	//
	
	public static void main(String[] args) {
		
		Palindromo app=new Palindromo();
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce una palabra :");
		String palabra=sc.next();
		app.esPalindromo(palabra);
		
		if (app.esPalindromo(palabra)) {
			System.out.print("La palabra introducida es un palindromo");
		}else System.out.print("La palabra introducida no es un palindromo");

	}

	//bolteo
	public String voltear(String palabra) {
		String nueva="";
		for (int i=palabra.length()-1;i>=0;i--) {
			nueva=nueva+palabra.charAt(i);
		}
		
		return nueva;
		
	}
	
	//Metodo que devuleva un buleano indicando si es palindramo
	public boolean esPalindromo(String palabraOriginal) {

		String palabraVolteada=voltear(palabraOriginal);
		
		if (palabraOriginal==palabraVolteada) {
			return true;
		}else {
			return false;
		}

	}
}
///
/**
 * public class Palindromo {
   
    public String voltear(String palabra){
       String volteada="";
       for(int i=palabra.length()-1;i>=0;i--){
           volteada=volteada+palabra.charAt(i);
       }
       return volteada;
    }
   
    public boolean esPalindromo(String palabra){
        String palabVolt=voltear(palabra);
        if(palabra.equals(palabVolt)) return true;
        else return false;
       
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba una palabra para determinar si es palindromo o no:");
        String palabra=sc.next();
       
        Palindromo app=new Palindromo();
        if(app.esPalindromo(palabra)){
            System.out.println("Es un palindromo");
           
        }else{
            System.out.println("No es un palindromo");
        }
       
    }
}
 */
*/