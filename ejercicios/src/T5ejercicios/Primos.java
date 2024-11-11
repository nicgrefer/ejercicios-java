package T5ejercicios;

public class Primos {

    

    public static void main(String[] args) {
    	int contadorDePrimos = 0;
        Primo appPrimo =new Primo();//Reutilización del programa anterior

        for (int n1 = 1; contadorDePrimos < 100; n1++) {
            boolean primo = appPrimo.esPrimo(n1);
            if (primo) {
                System.out.println("El número " + n1 + " es primo");
                contadorDePrimos++;
            }
        }
    }

   
}
