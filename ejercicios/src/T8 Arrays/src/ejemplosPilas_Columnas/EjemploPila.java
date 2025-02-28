package ejemplosPilas_Columnas;

import java.util.LinkedList;

public class EjemploPila {
    
    public static void main(String[] args) {
        String[] array = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        LinkedList<String> pila = new LinkedList<>(); // Corrige la declaración

        System.out.println(pila);// aquí esta vacia
        llenarPila(pila, array);//Rellena
        System.out.println(pila);//Tiene contenido
        vaciarPila(pila);//Borra
        System.out.println(pila);// Esta vacia
    }
    
    // Método para llenar la pila con los elementos del array
    public static void llenarPila(LinkedList<String> pila, String[] array) {
        for (String dia : array) {
            pila.push(dia); // Agrega cada día a la pila
        }
    }
    
    // Método para vaciar la pila e imprimir los elementos en orden inverso
    public static void vaciarPila(LinkedList<String> pila) {
        int posicion = 0;

        System.out.println("Elementos de la pila en orden inverso:");
        while (!pila.isEmpty()) { // Corrige el error de "isEmp"
            System.out.println("Posicion " + posicion + ": " + pila.pop());
            posicion++;
        }
    }
}
