package T6ejercicios.persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        Persona persona = new Persona();
        App app=new App();
        Scanner sc = new Scanner(System.in);
        String texto="";
        DateTimeFormatter formateoFecha = DateTimeFormatter.ofPattern("dd-mm-yyyy"); // Formato para fechas

        System.out.println("Introduzca el nombre:");
        texto=sc.nextLine();
        persona.setNombre(app.compruebaTexto(texto));

        System.out.println("Introduzca el apellido:");
        texto=sc.nextLine();
        persona.setApellidos(app.compruebaTexto(texto));


        System.out.println("Introduzca el DNI:");
        texto=sc.nextLine();
        persona.setDni(app.comprobarDNI(texto)));

        System.out.println("Introduzca sexo (h=hombre/m=mujer):");
        char sexo = sc.nextLine().charAt(0);
        persona.setSexo(sexo);

        System.out.println("Introduzca la fecha de nacimiento (formato dd-mm-yyyy):");
        String fechaNacimiento = sc.nextLine();
        persona.setFechaNacimiento(LocalDate.parse(fechaNacimiento, formateoFecha));

        System.out.println("Introduzca la edad en años:");
        persona.setEdadEnAños(sc.nextInt());

        System.out.println("Introduzca la altura en cm:");
        persona.setAlturaEnCentimetros(sc.nextDouble());

        System.out.println("Introduzca el peso en Kg:");
        persona.setPesoEnKg(sc.nextDouble());

        System.out.println("¿Está casado? (true/false):");
        persona.setCasado(sc.nextBoolean());

        // Imprimir datos para verificar
        System.out.println("\nDatos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellidos());
        System.out.println("DNI: " + persona.getDni());
        System.out.println("Sexo: " + persona.getSexo());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + persona.getEdadEnAños());
        System.out.println("Altura: " + persona.getAlturaEnCentimetros() + " cm");
        System.out.println("Peso: " + persona.getPesoEnKg() + " kg");
        System.out.println("Casado: " + (persona.isCasado() ? "Sí" : "No"));
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
    public String comprobarDNI(String dni ) {
       
        String dniCompleto = "";
        Scanner sc = new Scanner(System.in);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE"; // Letras válidas para un DNI
        char letracorrecta;
        do {
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
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // El formato válido.
        LocalDate fecha = null;
        LocalDate fechaHoy = LocalDate.now();
        do {
           
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
    
    
}
