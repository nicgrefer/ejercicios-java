package T6ejercicio.Banco;
/**
 * @version 1.5 añadido: funcionalidad vincular cuentas
 * @version 2.0 añadido: retirar, introducir y intereses del saldo
 */
public class Aplicación {

    public static void main(String[] args) {
        // Crear clientes
        Clientes cl1 = new Clientes("98765432X", "Nicolás", "Jové",null,0 );
        Clientes cl2 = new Clientes("98765432X", "María", "López", null, 0);
//
//        System.out.println(cl1);
//        System.out.println(cl2);

        // Crear cuentas asociadas a los clientes
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta(500);

        cl1.asignarCuenta(cuenta1);
        cl2.asignarCuenta(cuenta2);


        try {
			cuenta1.ingresar(25.7);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
        try {
			cuenta1.ingresar(-5);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
        try {
			cuenta2.reintegrar(600);
	       
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
        try {
	        cuenta2.reintegrar(-10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
        try {
	        cuenta2.reintegrar(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
        
        try {
	        cuenta2.interes();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
    }
}
