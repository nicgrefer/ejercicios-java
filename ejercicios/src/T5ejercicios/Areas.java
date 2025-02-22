package T5ejercicios;

import java.util.Scanner;

/*
 * Areas de figuras geometricas:
 *
 * Circulo: PI * r^2 
 * Cuadrado: a^2 
 * Rectangulo: a*b 
 * Triangulo: 1/2*b*h
 *
 */
public class Areas {

    public static Scanner sc;
    
    public void mostrarMenu() {
        // metodo que muestra por pantalla al usuario el menu de opciones
        System.out.println();
        System.out.println("Calculo de Areas");
        System.out.println("1-Circulo");
        System.out.println("2-Cuadrado");
        System.out.println("3-Rectangulo");
        System.out.println("4-Triangulo");
        System.out.println("5-Salir");
    }

    public double calcularArea(int opc) {
        // metodo que recibe la opcion elegida por el usuario,
        // y en funcion de ello calcula el area de la figura correspondiente

        double area = 0; // variable para almacenar el valor del area
        double a, b, h, r;

        switch (opc) {
            case 1:
                // area del circulo
                System.out.print("Radio: ");
                r = sc.nextDouble();
                area = Math.PI * Math.pow(r, 2);
                break;
            case 2:
                // area del cuadrado
                System.out.print("Lado: ");
                a = sc.nextDouble();
                area = Math.pow(a, 2);
                break;
            case 3:
                // area del rectangulo
                System.out.print("Ancho: ");
                a = sc.nextDouble();
                System.out.print("Alto: ");
                b = sc.nextDouble();
                area = a * b;
                break;
            case 4:
                // area del triangulo
                System.out.print("Base: ");
                b = sc.nextDouble();
                System.out.print("Altura: ");
                h = sc.nextDouble();
                area = 0.5 * b * h;
                break;
            case 5:
                break; // salir
            default: // en cualquier otro caso
                System.out.println("Opcion incorrecta");
        }
        return area; //devolvemos el resultado
    }

    public static void main(String args[]) {

        sc=new Scanner(System.in);
        Areas app=new Areas();
        int resp; //almacena la respuesta del usuario
        do {
            app.mostrarMenu();
            System.out.print("Opcion: ");
            resp = sc.nextInt();
            if (resp != 5) {    // si elige calcular el area de una figura
                // llamamos al metodo calcularArea
                System.out.println("Area: " + app.calcularArea(resp));
            }
        } while (resp != 5);    				// seguimos el proceso hasta que el usuario
           System.err.print("Estas Fuera");    // elija salir (5)

    }

}
