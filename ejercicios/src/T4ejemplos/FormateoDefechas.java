package T4ejemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;


public class FormateoDefechas {

	public static void main(String[] args) {
 //Format: LocalDate-->String       Parse: String-->LocalDate
        
        //Formateo de fechas
        LocalDate hoy=LocalDate.now();
        System.out.println("Formato predefinido: "+hoy);
        DateTimeFormatter dtf=DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println("Formato ISO: "+dtf.format(hoy));
        
        dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("Formato medio: " +dtf.format(hoy));
        
        dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("Formato medio: " +dtf.format(hoy));
        
        
        dtf=DateTimeFormatter.ofPattern("d/MM/yyyy");
        System.out.println("Formatedo personalizado: "+
                dtf.format(LocalDate.of(2024, Month.MARCH, 1)));
        
        //Formato
        //Hoy es martes 29 de nov de 2024
        dtf=DateTimeFormatter.ofPattern("'Hoy es' EEEE,dd 'de' LLL 'de' yyyy");
                System.out.println("Formatedo personalizado: "+
                dtf.format(hoy));
                
        //Parchaeo de fechas      
                
                
        try {
        	 String cadena="29/10</2024";
             
             dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
             LocalDate fechaUsuario=LocalDate.parse(cadena, dtf);
             
             System.out.println("has introducido la fecha: "+ fechaUsuario);
        } catch (DateTimeParseException ex){
        	System.err.print("Error, fecha no valida");
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
	}
}
