package T3ejemplos;

import java.util.Scanner;

public class MCD {

    public static void main(String[] args) {
        int d2 = 0, D2 = 0;
        int d3 = 0, D3 = 0;
        int d5 = 0, D5 = 0;
        int d7 = 0, D7 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un número");
        int n1 = teclado.nextInt();
        System.out.println("Dame otro número");
        int n2 = teclado.nextInt();

        // Haciendo MCD
        System.out.println("Haciendo MCD");

        while (n1 > 1) {
            if (n1 % 2 == 0) {
                d2++;
                n1 = n1 / 2;
            } else if (n1 % 3 == 0) {
                d3++;
                n1 = n1 / 3;
            } else if (n1 % 5 == 0) {
                d5++;
                n1 = n1 / 5;
            } else if (n1 % 7 == 0) {
                d7++;
                n1 = n1 / 7;
            } else {
                break;
            }
        }

        while (n2 > 1) {
            if (n2 % 2 == 0) {
                D2++;
                n2 = n2 / 2;
            } else if (n2 % 3 == 0) {
                D3++;
                n2 = n2 / 3;
            } else if (n2 % 5 == 0) {
                D5++;
                n2 = n2 / 5;
            } else if (n2 % 7 == 0) {
                D7++;
                n2 = n2 / 7;
            } else {
                break;
            }
        }

        int mcd = 1;
        mcd *= Math.pow(2, Math.min(d2, D2));
        mcd *= Math.pow(3, Math.min(d3, D3));
        mcd *= Math.pow(5, Math.min(d5, D5));
        mcd *= Math.pow(7, Math.min(d7, D7));

        System.out.println("El MCD es: " + mcd);
    }
}

