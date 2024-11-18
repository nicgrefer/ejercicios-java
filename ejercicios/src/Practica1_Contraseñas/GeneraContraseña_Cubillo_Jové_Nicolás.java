package Practica1_Contraseñas;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

public class GeneraContraseña_Cubillo_Jové_Nicolás {

	/**datos a utilizar*/
	public String nombre;
	public String apellido1;
	public String apellido2;
	public String dni;
	public String dniCompleto;
	public String fechaNacimiento;
	
	public Scanner sc=new Scanner (System.in);
	public static GeneraContraseña_Cubillo_Jové_Nicolás app=new GeneraContraseña_Cubillo_Jové_Nicolás();
	
	/**Inicio programa*/
	
	//Programa principal (inicio)
	public static void main(String[] args) {
		//Peticion de datos
		app.datosPersonales();
		//comprbamos la contraseña que se a generado para saver que tipò de seguridad proporciona
		app.comprobadorTamanioCodico();
/**  Funcionamiento del codigo:
 *  1º pido datos, 2º llamo a la variable comprobadorTamanioCodico que esta vinculado con la generadora de longitud estando está conectada a
 *  un aleatorio para escoger un tipo de conraseña a realizar devolviendo así la contraseña que sera presentada al usuario
 */
		
	}

	//Pido los daros personales
	public void datosPersonales(){
		//Nombre
		do {
			System.out.println("Introduce el nombre: ");
			nombre =sc.next().toLowerCase().trim();
			if (nombre.length()<3) {
				System.err.println("Nombre no valido");
			}
		}while (nombre.length()<3);
		
		//apellido1
		do {
			System.out.println("Introduce su 1º apellido: ");
			apellido1 =sc.next().toLowerCase().trim();
			if (apellido1.length()<3) {
				System.err.println("Apellido no valido");
			}
		}while (apellido1.length()<3);
		
		//apellido2
		do {
			System.out.println("Introduce su 2º apellido: ");
			apellido2 =sc.next().toLowerCase().trim();
			if (apellido2.length()<3) {
				System.err.println("Apellido no valido");
			}
		}while (apellido2.length()<3);
		//dni
		dni = ""; // dni introducido por el usuario
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letracorrecta = 0; // letra DNI calculada
        
        // bucle de validación del dni
        do {
            System.out.println("Introduce un DNI (sin letra): ");
            dni = sc.nextLine().toUpperCase().trim();
            if (dni.length() == 8 && dni.matches("\\d{8}")) {
                int numerodni = Integer.parseInt(dni);
                int resto = numerodni % 23;
                letracorrecta = letras.charAt(resto);
                System.out.println("DNI completo: " + dni + letracorrecta);
                dniCompleto=dni+letracorrecta;
            } else {
                System.out.println("DNI no válido. Inténtalo de nuevo.");
            }
        } while (dni.length() != 8 || !dni.matches("\\d{8}"));


      //fecha nacimiento
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha=null;
      		do {
      			System.out.println("Introduce su fecha de nacimiento: ");
          		fechaNacimiento =sc.next().trim();
          		
          		
          	  try {
                  // Comprobar si lo introducido coincide con lo pedido(con la plantilla)
                   fecha = LocalDate.parse(fechaNacimiento, format);

                
              } catch (DateTimeParseException e) {//Si introduce fecha incorrecta ERR
                  System.err.println("Formato de fecha no válidotiene que ser dd/mm/yyyy");
              }
      		}while (fecha==null);
      		
		
	}
	
	//Comprueba el nivel de seguridad de la contraseña y muestra por pantalla
	public void comprobadorTamanioCodico() {
	    String seguridadContrasena = "";

	    for (int i = 1; i <= 3; i++) {// Creamos bucle para realizar las 3 contraseñas
	        String contraseña = app.TipoContraseña();//guardamos el valor de la contraseña
	        int longCodigo = contraseña.length();//longitud del codigo

	        if (longCodigo >= 4 && longCodigo <= 6) {
	            seguridadContrasena = "Poco segura";
	        } else if (longCodigo > 6) {
	            // Verifica si contiene algún símbolo
	            String simbolos = "=!@#$%&/()"; 
	            boolean tieneSimbolo = false;

	            for (int j = 0; j < longCodigo; j++) {//bucle para comprobar si tiene simbolo
	                if (simbolos.contains(String.valueOf(contraseña.charAt(j)))) {
	                    tieneSimbolo = true;
	                    break;
	                }
	            }

	            seguridadContrasena = tieneSimbolo ? "Muy segura" : "Segura";
	        }

	        System.out.println("La contraseña es: " + contraseña + " con un nivel de seguridad: " + seguridadContrasena);//Printeo contraseña
	    }
	}
	
	//Aletorio para escoger el tipo de "codificación"
	public String TipoContraseña(){
		Random aleatorio=new Random();
		String contraseña="";//guardamos la contraseña que sale del cualquier tipo (aleatorio)
		int tipo=aleatorio.nextInt(3)+1;

			if (tipo==1) {
				int tamanio=aleatorio.nextInt(4,8);
				contraseña=app.caso1(tamanio); //caso dados y moneda
			}
			else if (tipo==2) {
				int tamanio=aleatorio.nextInt(4,8);
				contraseña=app.caso2(tamanio);//caso SecurityRamdom
				}
				
			else {
				int tamanio=aleatorio.nextInt(4,8);
				contraseña=app.caso3(tamanio);//Ultimo caso

		}
		return contraseña;
	}

	//caso 1 dados y moneda
	public String caso1(int tamanio ){
	
		String contraseniaTimp1="";
		Random aleatorio = new Random();
		int moneda=aleatorio.nextInt(0,1)+1;// Lanzamiento de la moneda para saber si va a salir mayusculas/minusculas/letras/simbolo
		if (moneda==1) {//minusculas y numeros
			//generamos los estilos
			String fila1="abcdef";
			String fila2="ghijkl";
			String fila3="mnopkr";
			String fila4="stuvwx";
			String fila5="yz0123";
			String fila6="456789";
			for (int i=1; i<=tamanio;i++) { //mintras que el tamaño definido de la contraseña no sea = a la longitud de la contraseña
				int fila = aleatorio.nextInt(6) + 1; // Genera entre 1 y 6 
		        switch (fila) {
		            case 1 -> contraseniaTimp1 += fila1.charAt(aleatorio.nextInt(fila1.length()));
		            case 2 -> contraseniaTimp1 += fila2.charAt(aleatorio.nextInt(fila2.length()));
		            case 3 -> contraseniaTimp1 += fila3.charAt(aleatorio.nextInt(fila3.length()));
		            case 4 -> contraseniaTimp1 += fila4.charAt(aleatorio.nextInt(fila4.length()));
		            case 5 -> contraseniaTimp1 += fila5.charAt(aleatorio.nextInt(fila5.length()));
		            case 6 -> contraseniaTimp1 += fila6.charAt(aleatorio.nextInt(fila6.length()));
		        }
				
			}
		} if (moneda==2){//mayusculas y sinbolos
			//generamos los estilos
			String fila1="ABCDEF";
			String fila2="GHIJKL";
			String fila3="MNOPKR";
			String fila4="STUVWX";
			String fila5="YZ=!@#";
			String fila6="$%&/()";
			for (int i=1; i<=tamanio;i++) {//mintras que el tamaño definido de la contraseña no sea = a la longitud de la contraseña
				int fila = aleatorio.nextInt(6) + 1; // Genera entre 1 y 6 
		        switch (fila) {
		            case 1 -> contraseniaTimp1 += fila1.charAt(aleatorio.nextInt(fila1.length()));
		            case 2 -> contraseniaTimp1 += fila2.charAt(aleatorio.nextInt(fila2.length()));
		            case 3 -> contraseniaTimp1 += fila3.charAt(aleatorio.nextInt(fila3.length()));
		            case 4 -> contraseniaTimp1 += fila4.charAt(aleatorio.nextInt(fila4.length()));
		            case 5 -> contraseniaTimp1 += fila5.charAt(aleatorio.nextInt(fila5.length()));
		            case 6 -> contraseniaTimp1 += fila6.charAt(aleatorio.nextInt(fila6.length()));
		        }
			}
		}
		return contraseniaTimp1;
	}
	
	//caso 2 aleatorios
	public String caso2(int tamanio) {
		SecureRandom sr =new SecureRandom();
		String contraseniaFinal="";//guardamos contraseña
		String caracteresValidos="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%/&()=";
				
		for (int i =0;i<tamanio;i++) {
			int posicionDelCararter=sr.nextInt(caracteresValidos.length());//se crea un aleatorio que correspondera a un caracter del string "caracteresValidos"
			contraseniaFinal=contraseniaFinal+caracteresValidos.charAt(posicionDelCararter);
		}
		return contraseniaFinal;
	}
	
	//caso3 "Mi idea"
	public String caso3(int tamanio) {
		// TODO Auto-generated method stub

		String contraseniaFinal ="";
		for (int i=1; i<=tamanio;i++) {//bucle para ir realizando la contraseña en funcion de la longitud de dicho codigo
			Random random=new Random();
			switch(i) {
			
				case 1 ->{
					String nombreMayus=nombre.toUpperCase();
					contraseniaFinal=contraseniaFinal+nombreMayus.charAt(1);
				}
				case 2 ->{
					int longapellido1=apellido1.length();
					contraseniaFinal=contraseniaFinal+apellido1.charAt(longapellido1 -1);
				}
				case 3->{
					int longDNI=dniCompleto.length();
					contraseniaFinal=contraseniaFinal+apellido2.charAt(longDNI-2);
				}
				case 4 ->{
					int longDNI=dniCompleto.length();
					contraseniaFinal=contraseniaFinal+apellido2.charAt(longDNI-3);
				}
				case 5-> {
					int longDNI=dniCompleto.length();
					contraseniaFinal=contraseniaFinal+apellido2.charAt(longDNI-1);
				}
				case 6 ->{
					int longNacimiento=fechaNacimiento.length();
					contraseniaFinal=contraseniaFinal+fechaNacimiento.charAt(longNacimiento -1);
				}
				case 7 -> {
					int longNacimiento=fechaNacimiento.length();
					contraseniaFinal=contraseniaFinal+fechaNacimiento.charAt(longNacimiento -2);
				}
				default -> {
					String simbolos="!@#$%&/()=";
					contraseniaFinal=contraseniaFinal+simbolos.charAt(random.nextInt(simbolos.length()));
				}
							
			}
				
		}
		return contraseniaFinal;
	}
	
	
	
}
