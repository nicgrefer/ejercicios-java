package T3ejemplos;

public class CarreraCaballos {

    public static void main(String[] args) {
        // Programa que simule una carrera de 2 caballos, con la misma probabilidad de ganar.
        // Cada vez que avanza, lo hacen en una unidad.
        // Ambos parten del valor 0 hasta la meta que se encuentra en un valor aleatorio del 100 al 200.
        // El caballo que llegue primero a la meta gana.

        int aux1 = 0; // distancia recorrida por el caballo 1
        int aux2 = 0; // distancia recorrida por el caballo 2
        int nCarrera=1;

        System.out.println("Empieza la carrera de caballos");
        System.out.println("¿Ganará el caballo 1 o el 2?");
        
        try {
            Thread.sleep(500); // Pausa de 500 milisegundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Creamos la pista
        int tamañoPista = (int)(100 * Math.random() + 100);
        System.out.println("La distancia a recorrer es " + tamañoPista);

        // Simulación de la carrera
        while (aux1 < tamañoPista && aux2 < tamañoPista) {
            int avanceCaballo1 = (int)(Math.random() * 11); // número aleatorio del 0 al 10
            int avanceCaballo2 = (int)(Math.random() * 11); // número aleatorio del 0 al 10

            aux1 += avanceCaballo1;
            aux2 += avanceCaballo2;

            // Representación gráfica del avance
            System.out.print(nCarrera + ": ");
            for (int i = 0; i < aux1; i++) {
                System.out.print("1");
            }
            System.out.println(" ");
            
            System.out.print(nCarrera + ": ");
            for (int j = 0; j < aux2; j++) {
                System.out.print("2");
            }
            System.out.println(" ");

            nCarrera++;
            
            // Pausa para visualizar el avance
            try {
                Thread.sleep(500); // Pausa de 500 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Verificar si alguno de los caballos ha llegado a la meta
            if (aux1 >= tamañoPista) {
                System.out.println("¡El caballo 1 ha ganado la carrera!");
                break;
            } else if (aux2 >= tamañoPista) {
                System.out.println("¡El caballo 2 ha ganado la carrera!");
                break;
            }
        }
    }
}
