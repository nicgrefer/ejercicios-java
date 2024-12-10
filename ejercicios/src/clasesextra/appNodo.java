package clasesextra;

public class appNodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nodo nodoRaiz=new Nodo("carpeta inicial","Carpeta");
		Nodo nodo2=new Nodo("victor.txt","Fichero");
		Nodo nodo3=new Nodo("victor.png","Fichero");
		Nodo nodoCarpeta=new Nodo("papelera reciclaje","Carpeta");
		Nodo nodoFichero = new Nodo("config.php", "Fichero");
		
		System.out.println(nodo2);
		
		nodoRaiz.getHijos().add(nodo2);
		nodoRaiz.getHijos().add(nodo3);
		nodoRaiz.getHijos().add(nodoCarpeta);
		nodoRaiz.getHijos().add(nodoFichero);
		nodoRaiz.getHijos().add(nodoFichero);
		
		
		mostrarContenido(nodoRaiz);
		
		
	}

	private static void mostrarContenido(Nodo nodo) {
		System.out.println(nodo);
		if (nodo.getTipo().equals("Carpeta"))
			for (Nodo n : nodo.getHijos())
				mostrarContenido(n);

	}

}