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
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}
