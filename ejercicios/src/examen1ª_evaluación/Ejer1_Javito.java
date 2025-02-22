package examen1ª_evaluación;

import java.util.Random;
import java.util.Scanner;

public class Ejer1_Javito {
    
    public static Scanner sc =new Scanner(System.in);
    public int fallos=0;
    
    
    public static void main(String[] args) {
        
        Ejer1_Javito app=new Ejer1_Javito();
        int longLaverinto=0;
        int puesto=0;
        
        System.out.println("Ayuda a Javito a encontrar su jugetito.");
        System.out.print("Que jugetito perdio Javito? :");
        String nombreJugete = sc.nextLine();//Guardamos el jugete
        if (nombreJugete.length()==0 ){
            System.err.println("Valor no valido. Vuela a empezar");
        }else{
            longLaverinto=app.tamañoLaverinto(nombreJugete);//calculamos la longitud del laverinto
            System.out.println("Tamano laberinto =  "+longLaverinto + " pasos");
            while(puesto<longLaverinto){//funcion bucle para alcanzar el sitio
                puesto=app.operacionAvanza(puesto);

            }
            System.out.println("Yuju! Mi " + nombreJugete );
            System.out.println("(Fallos " + app.fallos + ")" );
        }
       
    }
    
   
    
    public int operacionAvanza(int puesto){
        Random aleatorio =new Random();
       
        int numero1 =aleatorio.nextInt(10)+1;//aleatorio de 1 numero 10 incluido
        int numero2 =aleatorio.nextInt(10)+1;//aleatorio de 1 numero 10 incluido
        int simbolo =aleatorio.nextInt(3)+1;//aleatorio apara hacer la suma, resta o multiplicación
        switch (simbolo) {
            case 1 ->{
                int numeroEs=numero1+numero2; //suma
                System.out.println("Cuanto es " + numero1 + "+" + numero2);
                int numeroPone= sc.nextInt();//suamdel usuario
                //comprobación
               if (numeroPone==numeroEs){//cierto
                    puesto=puesto+50;
                    System.out.println("Si, es correcto. Puesto " + puesto);
                    return puesto;
                    
                }else{//falso
                    if (puesto != 0){//si esta abanzado
                        puesto=puesto-50;
                        System.out.println("Error " + puesto + " puestos");
                    
                    }
                    //sino 
                System.out.println("Error " + puesto + " puestos");
                fallos++;
                }
               return puesto;
            }
            case 2->{
                int numeroEs=numero1-numero2;//resta
                System.out.println("Cuanto es " + numero1 + "-" + numero2);
                int numeroPone= sc.nextInt();//resta usuario
                //comprobación
                if (numeroPone==numeroEs){//es cierto
                    puesto=puesto+50;
                    System.out.println("Si, es correcto. Puesto " + puesto);
                    return puesto;
                    
                }else{//es faaso
                    if (puesto != 0){//si esta abanzado
                        puesto=puesto-50;
                        System.out.println("Error " + puesto + " puestos");
                    
                    }
                    //sino
                    System.out.println("Error " + puesto + " puestos");
                    fallos++;
                }
                return puesto;
            }
            case 3->{
                int numeroEs=numero1*numero2;//multiplicación
                System.out.println("Cuanto es " + numero1 + "x" + numero2);
                int numeroPone= sc.nextInt();//multiplicación usuario
                //comprobación
                if (numeroPone==numeroEs){//es cierto
                    puesto=puesto+50;
                    System.out.println("Si, es correcto. Puesto " + puesto);
                    return puesto;
                    
                }else{//es falso
                    if (puesto != 0){//si esta abanzado
                        puesto=puesto-50;
                        System.out.println("Error " + puesto + " puestos");

                    }
                    //sino
                    System.out.println("Error " + puesto + " puestos");
                    fallos++;
                }
                return puesto;
            }
            default -> {
                System.err.println("Error del sistema");
            }
            
        }
        return puesto;
    }
    
    public int tamañoLaverinto(String nombre){
        //Sumamos el valor de cada caracter sugun su valor en la tabla ascii
        int longNombreJugete=nombre.length();
        int suamaCaracter=0;
        for (int i=0; i<longNombreJugete;i++){
            suamaCaracter=(int)(suamaCaracter+nombre.charAt(i));
        }
     
        return suamaCaracter;
    }
    
}
