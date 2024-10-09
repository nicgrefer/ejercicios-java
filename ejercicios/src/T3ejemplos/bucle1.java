package T3ejemplos;

public class bucle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aux=0;
		int n=1;
		while(n<=100) {
			aux=aux+n;//Suma parcial
			System.out.println(n);
			n++;
			
		}
		
		
		//Sumar los primeros 100 numeros
		
		System.out.println("La suma de los numeros del 1 al 100 es "+ aux);
		
		
		//Mostrarlos de manera decreciente (100->1)
		
				int m=100;
				while(m>0) {
					System.out.println(m);
					m--;
					
				}
		
	}

}
