
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author macarena
 */
public class Javito {

    public char generarOperacion() {
        Random r = new Random();
        int n = r.nextInt(3);
        if (n == 0) {
            return '+';
        } else if (n == 1) {
            return '-';
        } else {
            return '*';
        }
    }

    public int generarOperando() {
        return new Random().nextInt(1, 11);
    }

    public int calcular(int n1, int n2, char op) {
        return switch (op) {
            case '+' ->
                n1 + n2;
            case '-' ->
                n1 - n2;
            case '*' ->
                n1 * n2;
            default ->
                Integer.MIN_VALUE;
        };
    }

    public int calcularMeta(String juguete) {
        int cont = 0;
        for (int i = 0; i < juguete.length(); i++) {
            cont += juguete.charAt(i);
        }
        return cont;
    }

    public static void main(String[] args) {
        Javito app = new Javito();
        Scanner sc = new Scanner(System.in);

        String juguete;
        do {
            System.out.print("¿Javito, que juguete se te ha perdido? ");
            juguete = sc.nextLine();
        } while (juguete.isBlank());

        int meta = app.calcularMeta(juguete);
        System.out.printf("El juguete estÃ¡ a %s pasos.%n", meta);

        int fallos = 0;
        int javito = 0;
        while (javito < meta) {
            char operacion = app.generarOperacion();
            int num1 = app.generarOperando();
            int num2 = app.generarOperando();
            int resultado = app.calcular(num1, num2, operacion);

            try {
                System.out.println("Responde...");
                System.out.printf("> %d %s %d: ", num1, operacion, num2);
                int respuestaJavito = Integer.parseInt(sc.next());

                if (respuestaJavito == resultado) {
                    javito += 50;
                    System.out.printf("Correcto (posicion=%d)%n", javito);
                } else {
                    fallos++;
                    javito = Integer.max(0, javito - 50);
                    System.out.printf("Error (posicion=%d)%n", javito);
                }
            } catch (NumberFormatException ex) {
                System.out.println("Error de entrada de datos");
            }
        }
        System.out.printf("Yuju! mi %s (fallos=%d)%n", juguete, fallos);

    }

}
