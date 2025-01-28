package T7ejercicios.Ofertas_Interfaces;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que elija una oferta
        System.out.println("Seleccione una oferta (1, 2 o 3 para combinada): ");
        int seleccion = scanner.nextInt();

        // Crear la instancia correspondiente de Cliente basada en la selección del usuario
        Cliente1 cliente;
        if (seleccion == 1) {
            cliente = new Oferta1("John Doe", "john@example.com", 0.10);
        } else if (seleccion == 2) {
            double descuento = 0.50;
            cliente = new Oferta2("John Doe", "john@example.com", 0.10, descuento);
        } else if (seleccion == 3) {
            double descuento = 0.50;
            cliente = new OfertaCombinada("John Doe", "john@example.com", 0.10, descuento);
        } else {
            System.out.println("Selección inválida. Usando Oferta1 por defecto.");
            cliente = new Oferta1("John Doe", "john@example.com", 0.10);
        }

        // Simular una conexión
        System.out.println("Ingrese los segundos de conexión:");
        int segundos = scanner.nextInt();
        cliente.conexion(segundos);

        // Mostrar el importe calculado
        System.out.println("Importe: " + cliente.importe());


    }
}