/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macarena
 */
public class Contar {

    public int contar(int n) {
        if (n / 10 == 0) {
            return 1;
        }
        return 1 + contar(n / 10);
    }

    public static void main(String[] args) {
        Contar app = new Contar();
        System.out.println(app.contar(123));
    }

}
