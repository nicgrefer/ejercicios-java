package T3ejemplos;

import java.util.Scanner;

public class Not {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
 
        
        System.out.println("Introduce el número en binario de 8 bits: ");
        String entrada=sc.next();
        //EJERCICIO: tenemos que validar que sean ocho caracteres, ademas de que tengan que ser bits
        //????????
        
        
        String not=""; //va a contener la negacion de entrada
        
        //algoritmo de not binario
        for (int i=0; i<entrada.length();i++){
            char bit=entrada.charAt(i);
            if (bit=='0'){ 
                not=not+'1';
            }
            else if (bit == '1' ){
                not=not+'0';
            }
            
            
            
            
        }
        System.out.println("NOT("+entrada+"):"+not);
        
        //EJERCICIO (NO HAGAS CASO, EST� INCOMPLETO), tambien debe mostrar el mismo resultado en decimal
        int decimal=0;
        for (int j=0; j< entrada.length();j++){
            
            decimal=decimal+1;
        }
        
        
    }
}
