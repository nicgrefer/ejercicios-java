package T5ejercicios;

import java.util.Scanner;

public class SerieGeometrica {

    public static void main(String[] args) {
        SerieGeometrica app = new SerieGeometrica();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        System.out.println(app.p(numero));
        System.out.println(app.s(numero));
    }


        public double p(int n) {
            if (n == 1) return 1;
            return 1.0 / n * p(n - 1);
        }
        
        public double s(int i) {
            if (i == 1) return 1;
            return 1.0 / i + s(i - 1);
        }

}
