package T4ejercicios;

import java.util.Scanner;

public class DNI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=3; i++) {
        System.out.print("Introduce el DNI con la letra: ");
        String dni = sc.nextLine();
        char letra=dni.charAt(9);
       

            if (dni.length() == 9 && (letra=='A' ||letra=='B' ||letra=='B' ||letra=='D' ||letra=='E' ||letra=='F' ||letra=='G' ||letra=='H' ||letra=='I' ||letra=='J' ||letra=='K'|| letra=='L' ||letra=='M' ||letra=='N' ||letra=='Ñ'||letra=='O'||letra=='P'||letra=='Q'||letra=='R'||letra=='S'||letra=='T'||letra=='U'||letra=='V'||letra=='W'||letra=='X'||letra=='Y'||letra=='Z') ) {

            	
            	
            } else {
                System.err.println("Valor no válido. Vuelve a intentarlo.");
            }

        }
        System.err.println("Vuelve a intentarlo.");
    }
}
