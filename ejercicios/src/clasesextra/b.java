package clasesextra;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String b="_";
	        int conta=0;
	        int conta1=0;
	        String datos[] = {"Javier Vergel", "Jorge Alonso", "Mar Gonzalez", "Ana Blanco"};
	        for(int i = 0; i < datos.length; i++) {
	            String nombre=datos[i].substring(0,datos[i].indexOf(" "));
	            String apellido= datos[i].substring(datos[i].indexOf(" ")+1, datos[i].length());
	            
	            while(conta<(15-nombre.length())){
	                System.out.print(b);
	                conta++;
	            }
	            System.out.print(nombre);
	            while(conta1<15-apellido.length()){
	                
	                System.out.print(b);
	                conta1++;
	            }
	            System.out.println(apellido);
	            conta=0;
	            conta1=0;
	        }
		}
	}

