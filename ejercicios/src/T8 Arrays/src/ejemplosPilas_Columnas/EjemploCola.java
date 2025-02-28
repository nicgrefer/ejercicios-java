package ejemplosPilas_Columnas;

import java.util.LinkedList;
import java.util.Scanner;

public class EjemploCola {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> colaImpresion = new LinkedList<>();
        String archivo;
        
        // Capturar archivos a imprimir
        do {
            System.out.println("Introduce archivo a imprimir (deja vacio para salir):");
            archivo = sc.nextLine();
            
            if (!archivo.isEmpty()) { // Agregar solo si no esta vacio
                colaImpresion.addLast(archivo);
            }
            
        } while (!archivo.isEmpty()); 
        
        System.out.println("Cola de impresion completada. Procesando archivos...\n");

        // Procesar la cola de impresion
        while (!colaImpresion.isEmpty()) {  
            Thread.sleep(2000); // Simula el tiempo de impresion
            System.out.println("Imprimiendo... " + colaImpresion.removeFirst());
        }
        
        System.out.println("Cola de impresion vacia. Todos los archivos han sido impresos.");
        
        sc.close(); // Cerrar Scanner
    }
}
