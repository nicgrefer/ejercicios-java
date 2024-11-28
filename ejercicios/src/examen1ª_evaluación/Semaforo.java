package examen_1eva;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author macarena
 */
public class Semaforo {

    public static final String RED = "\uD83D\uDD34";    // đŸ”´
    public static final String GREEN = "\uD83D\uDFE2";  // đŸŸ¢
    public static final String YELLOW = "\uD83D\uDFE1"; // đŸŸ¡

    public void aRojo() throws InterruptedException  {
        System.out.println(RED);
        Thread.sleep(1000);
    }

    public void aVerde() throws InterruptedException {
        System.out.println(GREEN);
        Thread.sleep(1000);
    }

    public void aAmarillo() throws InterruptedException {
        System.out.println(YELLOW);
        Thread.sleep(1000);
    }

    public void generarCiclo() {
        try {
            aRojo();
            aVerde();
            aAmarillo();
            System.out.println();
        } catch (InterruptedException ex) {
            System.out.println("Error simulacion");;
        }
    }

    public static void main(String[] args) {
        Semaforo app = new Semaforo();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("¿Cuantos ciclos quieres simular? ");
            int ciclos = Integer.parseInt(sc.next());

            for (int i = 0; i < ciclos; i++) {
                app.generarCiclo();
            }
        } catch (NumberFormatException ex) {
            System.out.println("Error entrada de datos");
        }

    }

}
