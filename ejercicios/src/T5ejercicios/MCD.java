package T5ejercicios;

import java.util.Scanner;

public class MCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame un número");
        int num1 = sc.nextInt();
        System.out.println("Dame otro número");
        int num2 = sc.nextInt();
        
        int resultado = calcularMCD(num1, num2);
        System.out.println("El MCD es: " + resultado);
        
      
    }

    public static int calcularMCD(int n1, int n2) {
        int resto = 1;
        while (resto != 0) { // Mientras que el resto no sea 0 haremos la siguiente instrucción         
            resto = n1 % n2; 
            n1 = n2; // Sustituimos el número 1 por el número 2
            if (resto != 0) { // Mientras el resto sea distinto de 0 cambiaremos número 2 por el valor del resto
                n2 = resto;
            }
        }
        return n2;
    }
}
