package T5ejemplos;

import java.util.Scanner;

public class OperacionesV2 {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Programa que realiza las operaciones básicas con dos datos
        OperacionesV2 op = new OperacionesV2();
        int n1 = op.pedirNumero1();
        int n2 = op.pedirNumero2();

        System.out.println("Suma: " + op.suma(n1, n2));
        System.out.println("Resta: " + op.resta(n1, n2));
        System.out.println("Multiplicación: " + op.multiplica(n1, n2));
        System.out.println("División: " + op.divide(n1, n2));


    }

    // Método para sumar dos enteros
    public int suma(int a, int b) {
        return a + b;
    }

    // Método para restar dos enteros
    public int resta(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dos enteros
    public int multiplica(int a, int b) {
        return a * b;
    }

    // Método para dividir dos enteros
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }

    public int pedirNumero1() {
        System.out.print("Dame un número: ");
        return sc.nextInt();
    }

    public int pedirNumero2() {
        System.out.print("Dame otro número: ");
        return sc.nextInt();
    }


    
}
