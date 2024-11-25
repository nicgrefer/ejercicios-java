package examen1ª_evaluación;

import java.util.Scanner;

public class Ejer2_semaforo {

    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         Ejer2_semaforo app=new Ejer2_semaforo();
         
        System.out.print("¿Cuantos ciclos quieres simular? ");
        int circulos=sc.nextInt();//Guarda cuantas veces se va a mostrar
        app.generaCirculo(circulos);
    }
    
    public int generaCirculo(int circulos){
        
        for(int i=1;i<=circulos;i++){//bucle para ir mostrando n semaforos
            //Printea el semaforo de luz a luz
            aRojo();
            aAmarillo();
            aVerde();
            System.out.println("");
        }
        
        return 0;
    }

   public void aRojo(){//Luz roja
       
       System.out.println("Rojo");
    }
    
   public void aAmarillo(){//Luz amarilla
    
       System.out.println("Amarillo");
    }
    
   public void aVerde(){//luz verde
       
       System.out.println("Verde");
    }
   
}
