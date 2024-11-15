
package T5ejercicios;
import java.util.Scanner;

public class PotenciaRecursiva {

    //Metodo recursivo que calcula la potencia de n1 elevado a n2
    // n1: base
    // n2: exponente
    public float potenciaR(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp > 0) {
            return base * potenciaI(base, exp - 1);
        } else {
            return 1 / base * potenciaI(base, exp + 1);
        }

    }

    public float potenciaI(int base, int exp) {
        int potencia = 1; //acumula la secuencia de productos
        for (int i = 0; i < exp; i++) {
            potencia = potencia * base;
        }
        return potencia;
    }

    public static void main(String[] args) {
        PotenciaRecursiva app = new PotenciaRecursiva();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n1 = sc.nextInt();

        System.out.print("Introduce el exponente: ");
        int n2 = sc.nextInt();

        double potencia = Math.pow(n1, n2);
        System.out.println(app.potenciaR(n1, n2));
        System.out.println(app.potenciaI(n1, n2));
    }
}