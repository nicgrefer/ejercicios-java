package T5ejemplos;

public class MetodosRecursivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MetodosRecursivos rec=new MetodosRecursivos();
		rec.mostrar(0);
		
	}

	//metodo que muestra los numeros del 0 al 100
	public void mostrar (int i) {
		if (i==101) return;
		//else
		System.out.print(i+", ");
		mostrar(i+1);
	}
	
}
