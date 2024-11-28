package examen1ª_evaluación;

import java.util.Scanner;

public class Ejer3_Recursividad {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        Ejer3_Recursividad app=new Ejer3_Recursividad();
        
        System.out.println("Introduce un número entero");
        int num=sc.nextInt();//Pide los numeors
        String numeroString=Integer.toString(num);//Pasa el numero a String
        int longNum= numeroString.length();//Cuenta la longitud del srtring
        int numerosTiene=app.contadorNumeros(longNum);//Recursividad
        System.out.println("El numero " + num + " esta compuesto por " + numerosTiene + " numeros" );
        
    }
    
    public int contadorNumeros(int longNum){
        int numerosTiene=0;
        if (numerosTiene<=longNum ){
            numerosTiene++;//Se sima 1 a cuantos numeros tiene
            return contadorNumeros(longNum-1);//repite pero con una longitud menor
        }
        return numerosTiene;
    }
}