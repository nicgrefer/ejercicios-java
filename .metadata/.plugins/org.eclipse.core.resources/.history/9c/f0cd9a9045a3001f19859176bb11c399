package T5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carjimsa
 */
public class MCDRecursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MCDRecursivo app = new MCDRecursivo();
        System.out.println("MCD aplicando el Algoritmo de Euclides...");
        int numero1;
        int numero2;
        //bucle de validación de los numeros 
        //repetimos mientras sean no positivos
        do {
            System.out.print("Primer numero (positivo): ");
            numero1 = sc.nextInt();
            System.out.print("Segundo numero (positivo): ");
            numero2 = sc.nextInt();
            if (numero1 <= 0 || numero2 <= 0) {
                System.out.println("Error. Datos no validos");
                System.out.println("Vuelve a intentarlo");
            }
        } while (numero1 <= 0 || numero2 <= 0);
        //preparamos las variables para que 
        //numero1 sea el mayor de los dos
        //y así el algoritmo funcione
        if (numero1 <= numero2) {
            int aux = numero1;
            numero2 = numero1;
            numero1 = aux;
        }
        //aplicamos el algorimo de Euclides
        //sabiendo que numero1 y numero2 son positivos
        //y numero1 es el mayor
        System.out.println("El MCD es: " + app.mcd(numero1, numero2));
    }

    //metodo recursivo Alg. de Euclides
    public int mcd(int mayor, int menor) {
        int resto = mayor % menor;
        if (resto == 0) {
            return menor; //contiene el MCD
        }
        return mcd(menor, resto); //llamada recursiva haciendo el cambio de variables
    }
}