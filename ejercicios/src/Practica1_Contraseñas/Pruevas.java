package Practica1_Contraseñas;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Pruevas {

    // Método para identificar qué tan segura es la contraseña
    public String esSegura(String contrasena) {
        // Colores para la salida en consola
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String AMARILLO = "\u001B[33m";
        String VERDE = "\u001B[32m";

        String seguridad;
        // Evaluamos la seguridad de la contraseña según sus características
        if (contrasena.length() < 6) {
            seguridad = ROJO + "poco segura" + RESET;
        } else if (contrasena.length() >= 6 && contieneCaracteresEspeciales(contrasena) 
                && contieneMayusculas(contrasena) && contieneDigitos(contrasena) && contieneMinusculas(contrasena)) {
            seguridad = VERDE + "muy segura" + RESET;
        } else {
            seguridad = AMARILLO + "segura" + RESET;
        }
        return seguridad;
    }

    // Método para comprobar si la contraseña contiene caracteres especiales
    public boolean contieneCaracteresEspeciales(String contrasena) {
        String caracteresEspeciales = "!@#$%/&()=-_.*";
        for (int i = 0; i < contrasena.length(); i++) {
            if (caracteresEspeciales.contains(String.valueOf(contrasena.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    // Método para comprobar si la contraseña contiene letras mayúsculas
    public boolean contieneMayusculas(String contrasena) {
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isUpperCase(contrasena.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Método para comprobar si la contraseña contiene letras minúsculas
    public boolean contieneMinusculas(String contrasena) {
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isLowerCase(contrasena.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Método para comprobar si la contraseña contiene dígitos
    public boolean contieneDigitos(String contrasena) {
        String digitos = "1234567890";
        for (int i = 0; i < contrasena.length(); i++) {
            if (digitos.contains(String.valueOf(contrasena.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    // Método para comprobar si un texto cumple con el formato válido
    public String compruebaTexto(String texto) {
        Scanner sc = new Scanner(System.in);
        Pattern validoString = Pattern.compile("[A-ZÁÉÍÓÚ][a-záéíóúñÁÉÍÓÚÑ]+"); // Patrón: Al menos 2 caracteres, iniciando con mayúscula.
        while (texto == null || texto.length() < 3 || !validoString.matcher(texto).matches()) {
            System.err.println("Valor no válido. Debe empezar con mayúscula y tener al menos 3 caracteres.");
            texto = sc.nextLine();
        }
        return texto;
    }

    // Método para comprobar si un DNI es válido
    public String comprobarDNI() {
        String dni = "";
        String dniCompleto = "";
        Scanner sc = new Scanner(System.in);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE"; // Letras válidas para un DNI
        char letracorrecta;
        do {
            System.out.println("Introduce un DNI (sin letra): ");
            dni = sc.next().trim();
            if (dni.matches("\\d{8}")) {
                int numerodni = Integer.parseInt(dni);
                int resto = numerodni % 23;
                letracorrecta = letras.charAt(resto); // Cálculo de la letra del DNI
                dniCompleto = dni + letracorrecta;
                System.out.println("DNI completo: " + dniCompleto);
            } else {
                System.err.println("DNI no válido. Inténtalo de nuevo.");
            }
        } while (!dni.matches("\\d{8}"));
        return dniCompleto;
    }

    // Método para comprobar si una fecha es válida
    public String comprobarFecha() {
        String fechaNacimiento = "";
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato esperado: dd/MM/yyyy
        LocalDate fecha = null;
        LocalDate fechaHoy = LocalDate.now();
        do {
            System.out.println("Introduce la fecha de nacimiento (dd/MM/yyyy): ");
            fechaNacimiento = sc.next().trim();
            try {
                fecha = LocalDate.parse(fechaNacimiento, format);
                if (fecha.isAfter(fechaHoy) || fecha.isEqual(fechaHoy)) {
                    System.out.println("La fecha de nacimiento no puede ser del futuro/hoy.");
                    fecha = null;
                }
            } catch (DateTimeParseException e) {
                System.err.println("Formato de fecha no válido. Debe ser dd/MM/yyyy.");
            }
        } while (fecha == null);
        return fechaNacimiento;
    }
    
 // Caso 1: Dados y moneda
 		public String caso1(int tamanio) {
 			String contraseniaTimp1 = "";
 			Random aleatorio = new Random();
 			int moneda = aleatorio.nextInt(2) + 1; // Lanzamiento de la moneda para saber si va a salir
 													// mayúsculas/minúsculas/letras/símbolos

 			if (moneda == 1) { // Minúsculas y números
 				String fila1 = "abcdef";
 				String fila2 = "ghijkl";
 				String fila3 = "mnopkr";
 				String fila4 = "stuvwx";
 				String fila5 = "yz0123";
 				String fila6 = "456789";
 				for (int i = 1; i <= tamanio; i++) {
 					int fila = aleatorio.nextInt(6) + 1;
 					switch (fila) {
 					case 1 -> contraseniaTimp1 += fila1.charAt(aleatorio.nextInt(fila1.length()));
 					case 2 -> contraseniaTimp1 += fila2.charAt(aleatorio.nextInt(fila2.length()));
 					case 3 -> contraseniaTimp1 += fila3.charAt(aleatorio.nextInt(fila3.length()));
 					case 4 -> contraseniaTimp1 += fila4.charAt(aleatorio.nextInt(fila4.length()));
 					case 5 -> contraseniaTimp1 += fila5.charAt(aleatorio.nextInt(fila5.length()));
 					case 6 -> contraseniaTimp1 += fila6.charAt(aleatorio.nextInt(fila6.length()));
 					}
 				}
 			} else { // Mayúsculas y símbolos
 				String fila1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 				String fila2 = "!@#$%^&*()";
 				for (int i = 1; i <= tamanio; i++) {
 					int fila = aleatorio.nextInt(2) + 1;
 					if (fila == 1) {
 						contraseniaTimp1 += fila1.charAt(aleatorio.nextInt(fila1.length()));
 					} else {
 						contraseniaTimp1 += fila2.charAt(aleatorio.nextInt(fila2.length()));
 					}
 				}
 			}
 			return contraseniaTimp1;
 		}

 		// Caso 2: Generación aleatoria de contraseñas seguras
 		public String caso2(int tamanio) {
 			String contrasena2 = "";
 			String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
 			SecureRandom random = new SecureRandom();
 			for (int i = 0; i < tamanio; i++) {
 				contrasena2 += caracteresPermitidos.charAt(random.nextInt(caracteresPermitidos.length()));
 			}
 			return contrasena2;
 		}

 		// Caso 3: Contraseña personalizada basada en los datos
 		public String caso3(int tamanio, String nombre, String apellido1, String apellido2, String dniCompleto,
 				String fechaNacimiento) {
 			String contrasenia3 = "";
 			for (int i = 1; i <= tamanio; i++) {// bucle para ir realizando la contraseña en función de la longitud de dicho
 												// código
 				Random random = new Random();
 				switch (i) {

 				case 1 -> {// Primera letra del nombre en mayuscula (Ya está introducido en mayusculas por
 							// el usuario)
 					String nombreMayus = nombre.toUpperCase();
 					contrasenia3 = contrasenia3 + nombreMayus.charAt(0);
 				}
 				case 2 -> {// Ultima letra del 1º apellido
 					int longapellido1 = apellido1.length();
 					contrasenia3 = contrasenia3 + apellido1.charAt(longapellido1 - 1);
 				}
 				case 3 -> {
 					int longDNI = dniCompleto.length();// Ultimo numero del DNI
 					contrasenia3 = contrasenia3 + dniCompleto.charAt(longDNI - 2);
 				}
 				case 4 -> {// Penultimo numero del DNI
 					int longDNI = dniCompleto.length();
 					contrasenia3 = contrasenia3 + dniCompleto.charAt(longDNI - 3);
 				}
 				case 5 -> {// Letra del DNI
 					int longDNI = dniCompleto.length();
 					contrasenia3 = contrasenia3 + dniCompleto.charAt(longDNI - 1);
 				}
 				case 6 -> {// Ultimo numero de fecha de nacimiento (siendo este ultimo digito el del año)
 					int longNacimiento = fechaNacimiento.length();
 					contrasenia3 = contrasenia3 + fechaNacimiento.charAt(longNacimiento - 1);
 				}
 				case 7 -> {// Penultimo numero de fecha de nacimiento (siendo este penultimo digito el del
 							// año)
 					int longNacimiento = fechaNacimiento.length();
 					contrasenia3 = contrasenia3 + fechaNacimiento.charAt(longNacimiento - 2);
 				}
 				default -> {// Un simbolo aleatorio
 					String simbolos = "=!@#$%&/()";
 					contrasenia3 = contrasenia3 + simbolos.charAt(random.nextInt(simbolos.length()));
 				}

 				}

 			}
 			return contrasenia3;
 		}
 		
 		

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pruevas app = new Pruevas();

        // Recolección y validación de datos del usuario
        System.out.println("Introduce tu nombre:");
        String nombre = app.compruebaTexto(null);

        System.out.println("Introduce tu primer apellido:");
        String apellido1 = app.compruebaTexto(null);

        System.out.println("Introduce tu segundo apellido:");
        String apellido2 = app.compruebaTexto(null);

        System.out.println("Introduce tu DNI (sin letra):");
        String dniCompleto = app.comprobarDNI();

        System.out.println("Introduce tu fecha de nacimiento (dd/MM/yyyy):");
        String fechaNacimiento = app.comprobarFecha();

        // Generación de contraseñas
        Random aleatorio = new Random();
        String contrasenia1 = app.caso1(aleatorio.nextInt(5) + 4);
        String contrasenia2 = app.caso2(aleatorio.nextInt(5) + 4);
        String contrasenia3 = app.caso3(aleatorio.nextInt(5) + 4, nombre, apellido1, apellido2, dniCompleto, fechaNacimiento);

        // Muestra de contraseñas generadas con su nivel de seguridad
        System.out.println("La primera contraseña generada es: " + contrasenia1 + " y es " + app.esSegura(contrasenia1) + ".");
        System.out.println("La segunda contraseña generada es: " + contrasenia2 + " y es " + app.esSegura(contrasenia2) + ".");
        System.out.println("La tercera contraseña generada es: " + contrasenia3 + " y es " + app.esSegura(contrasenia3) + ".");
    }
}
