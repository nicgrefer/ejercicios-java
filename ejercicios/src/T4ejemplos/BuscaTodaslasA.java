package T4ejemplos;

public class BuscaTodaslasA {

    public static void main(String[] args) {
        String s3 = "Desarrollo de aplicaciones multiplataforma";
        int posicion = -1; // Start searching from the beginning of the string

        do {
            posicion = s3.indexOf("a", posicion + 1);
            System.out.println("Ocurrencia en posición: " + posicion);
           
        } while (posicion != -1);
    }
}