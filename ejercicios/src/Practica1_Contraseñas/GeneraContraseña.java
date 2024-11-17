package Practica1_Contraseñas;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

public class GeneraContraseña {

	public String nombre;
	public String apellido1;
	public String apellido2;
	public String dni;
	public String dniCompleto;
	public String fechaNacimiento;
	
	
	public Scanner sc=new Scanner (System.in);

	public static GeneraContraseña app=new GeneraContraseña();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Peticion de datos
		app.datosPersonales();
		//llamamos a la funcion para crear tres tipos de contraseñas diferentes con tres estilos posibles
		//app.tipoContraseña();
		 String contrasenia = app.caso3(8);
		    System.out.println("Contraseña generada: " + contrasenia);
	}

	//Pido los daros personales
	public void datosPersonales(){
		//Nombre
		System.out.println("Introduce el nombre: ");
		nombre =sc.next().toLowerCase();
		//apellido1
		System.out.println("Introduce su 1º apellido: ");
		apellido1 =sc.next().toLowerCase();
		//apellido2
		System.out.println("Introduce su 2º apellido: ");
		apellido2 =sc.next().toLowerCase();
		//dni
		dni = ""; // dni introducido por el usuario
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letracorrecta = 0; // letra DNI calculada
        
        // bucle de validación del dni
        do {
            System.out.println("Introduce un DNI (sin letra): ");
            dni = sc.nextLine().toUpperCase();
            if (dni.length() == 8 && dni.matches("\\d{8}")) {
                int numerodni = Integer.parseInt(dni);
                int resto = numerodni % 23;
                letracorrecta = letras.charAt(resto);
                System.out.println("DNI completo: " + dni + letracorrecta);
                dniCompleto=dni+letracorrecta;
            } else {
                System.err.println("DNI no válido. Inténtalo de nuevo.");
            }
        } while (dni.length() != 8 || !dni.matches("\\d{8}"));


      //fecha nacimiento
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha=null;
      		do {
      			System.out.println("Introduce su fecha de nacimiento: ");
          		fechaNacimiento =sc.next();
          		
          		
          	  try {
                  // Comprobar si lo introducido coincide con lo pedido(con la plantilla)
                   fecha = LocalDate.parse(fechaNacimiento, format);

                
              } catch (DateTimeParseException e) {//Si introduce fecha incorrecta ERR
                  System.err.println("Formato de fecha no válidotiene que ser dd/mm/yyyy");
              }
      		}while (fecha==null);
      		
		
	}
	
	
	//Aletorio para escoger el tipo de "codificación"
	public void tipoContraseña(){
		Random aleatorio=new Random();
		for(int i=1;i<=3;i++) {
			int tipo=aleatorio.nextInt(1,3)+1;

			if (tipo==1) {
				int tamanio=aleatorio.nextInt(4,8);
				app.caso1(tamanio); //caso dados y moneda
			}
			else if (tipo==2) {
				int tamanio=aleatorio.nextInt(4,8);
				app.caso2(tamanio);//caso SecurityRamdom
				}
				
			else {
				int tamanio=aleatorio.nextInt(4,8);
				app.caso3(tamanio);//Ultimo caso
			}
		}
	}

	//caso 1 dados y moneda
	public void caso1(int tamanio ){
	
		String contraseniaTimp3="";
		Random aleatorio = new Random();
		int moneda=aleatorio.nextInt(0,1)+1;
		if (moneda==1) {//minusculas y numeros
			String fila1="abcdef";
			String fila2="ghijkl";
			String fila3="mnopkr";
			String fila4="stuvwx";
			String fila5="yz0123";
			String fila6="456789";
			for (int i=1; i<=tamanio;i++) {
				int fila = aleatorio.nextInt(6) + 1; // Genera entre 1 y 6 
		        switch (fila) {
		            case 1 -> contraseniaTimp3 += fila1.charAt(aleatorio.nextInt(fila1.length()));
		            case 2 -> contraseniaTimp3 += fila2.charAt(aleatorio.nextInt(fila2.length()));
		            case 3 -> contraseniaTimp3 += fila3.charAt(aleatorio.nextInt(fila3.length()));
		            case 4 -> contraseniaTimp3 += fila4.charAt(aleatorio.nextInt(fila4.length()));
		            case 5 -> contraseniaTimp3 += fila5.charAt(aleatorio.nextInt(fila5.length()));
		            case 6 -> contraseniaTimp3 += fila6.charAt(aleatorio.nextInt(fila6.length()));
		        }
				
			}
		} if (moneda==2){//mayusculas y sinbolos
			String fila1="ABCDEF";
			String fila2="GHIJKL";
			String fila3="MNOPKR";
			String fila4="STUVWX";
			String fila5="YZ=!@#";
			String fila6="$%&/()";
			for (int i=1; i<=tamanio;i++) {
				int fila = aleatorio.nextInt(6) + 1; // Genera entre 1 y 6 
		        switch (fila) {
		            case 1 -> contraseniaTimp3 += fila1.charAt(aleatorio.nextInt(fila1.length()));
		            case 2 -> contraseniaTimp3 += fila2.charAt(aleatorio.nextInt(fila2.length()));
		            case 3 -> contraseniaTimp3 += fila3.charAt(aleatorio.nextInt(fila3.length()));
		            case 4 -> contraseniaTimp3 += fila4.charAt(aleatorio.nextInt(fila4.length()));
		            case 5 -> contraseniaTimp3 += fila5.charAt(aleatorio.nextInt(fila5.length()));
		            case 6 -> contraseniaTimp3 += fila6.charAt(aleatorio.nextInt(fila6.length()));
		        }
			}
		}
	}
	
	//caso 2 aleatorios
	public String caso2(int tamanio) {
		SecureRandom sr =new SecureRandom();
		String contraseniaFinal="";
		String caracteresValidos="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%/&()=";
		
		int longitudContraseniaTipo2=sr.nextInt(5)+4;
		
		for (int i =0;i<longitudContraseniaTipo2;i++) {
			int posicionDelCararter=sr.nextInt(caracteresValidos.length());
			contraseniaFinal=contraseniaFinal+caracteresValidos.charAt(posicionDelCararter);
		}
		return contraseniaFinal;
	}
	
	//caso3 "Mi idea"
	private String caso3(int tamanio) {
		// TODO Auto-generated method stub

		String contraseniaFinal ="";
		for (int i=1; i<=tamanio;i++) {
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
