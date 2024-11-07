package T5ejercicios;

import java.util.Scanner;

public class Utiles {
	
    //Metodo que recibe como par�metro grados Celsius
    //y devuelve grados Fahrenheit
    public double toFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }

    //Metodo que recibe un numero entero y devuelve
    //si es par o no
    public boolean par(int numero) {
        return (numero % 2 == 0);
    }

    //M�todo que devuelve el divisor m�s grande
    //de un numero recibido como parametro
    public int divisor(int numero) {
        for (int i = numero - 1; i > 0; i--) {
            if (numero % i == 0) {
                return i; //es el divisor buscado
            }
        }
        //si no nos salimos del m�todo dentro del for es porque 
        //el numero es primo
        return 1; //el divisor mas grande de un primo distinto de �l
    }

}
